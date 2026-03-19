package irvine.math.matrix;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * Compte Hafnian of a matrix.
 * @author Sean A. Irvine
 */
public final class Hafnian {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final long[][] mM;
  private Z mHafnian = Z.ZERO;

  private Hafnian(final long[][] m) {
    mM = m;
  }

  private void hafnian(final int[] p, final int pos, final Z prod) {
    if (pos >= p.length) {
      mHafnian = mHafnian.add(prod);
      return;
    }
    final int t = p[pos];
    for (int k = pos; k < p.length; ++k) {
      p[pos] = p[k];
      p[k] = t;
      if ((pos & 1) == 1) {
        // Break 2* symmetry for ordering within the pairs
        if (p[pos] > p[pos - 1]) {
          hafnian(p, pos + 1, prod.multiply(mM[p[pos - 1]][p[pos]]));
        }
      } else {
        // Break n! symmetry of ordering of the pairs themselves
        if (p[pos] > p[pos - 2]) {
          hafnian(p, pos + 1, prod);
        }
      }
      p[k] = p[pos];
    }
    p[pos] = t;
  }

  private Z computeHafnian(final int[] p) {
    mHafnian = Z.ZERO;
    hafnian(p, 2, Z.valueOf(mM[p[0]][p[1]])); // First pair is already fixed
    return mHafnian;
  }

  /**
   * Compute the Hafnian of a matrix.
   * @param mat matrix
   * @return Hafnian
   */
  public static Z hafnian(final long[][] mat) {
    if (mat.length == 0) {
      return Z.ONE;
    }
    final ExecutorService pool = Executors.newFixedThreadPool(THREADS);
    final CompletionService<Z> ecs = new ExecutorCompletionService<>(pool);

    int tasks = 0;
    for (int k = 1; k < mat.length; ++k) {
      final int[] p = IntegerUtils.identity(new int[mat.length]);
      p[1] = k;
      p[k] = 1;
      ecs.submit(() -> new Hafnian(mat).computeHafnian(p));
      ++tasks;
    }

    Z sum = Z.ZERO;
    for (int i = 0; i < tasks; ++i) {
      try {
        sum = sum.add(ecs.take().get());
      } catch (final InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
    pool.shutdown();
    return sum;
  }
}
