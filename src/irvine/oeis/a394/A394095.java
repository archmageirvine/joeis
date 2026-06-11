package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394095 Number of convex sets satisfying the condition.
 * @author Sean A. Irvine
 */
public class A394095 extends Sequence0 {

  // Ported from https://github.com/SofaaSogo-oh/2gar-code/blob/master/main.cc

  private int mN = -1;
  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private static boolean contains(final long a, final long b) {
    return (a & b) == b;
  }

  private static long findHull(final long x, final long[] convex) {
    long hull = ~0L;
    for (final long y : convex) {
      if (contains(y, x)) {
        hull &= y;
      }
    }
    return hull;
  }

  private static boolean checkConvex(final long[] convex, final long[] allMasks, final long[] checkMasks, final int dim) {

    final long[] hullFor = new long[checkMasks.length];
    for (int k = 0; k < checkMasks.length; ++k) {
      hullFor[k] = findHull(checkMasks[k], convex);
    }

    final boolean[] inConvex = new boolean[1 << dim];
    for (final long m : convex) {
      inConvex[(int) m] = true;
    }

    for (final long m : allMasks) {
      boolean existHolds = true;
      for (int k = 0; k < checkMasks.length; ++k) {
        final long key = checkMasks[k];
        if (contains(m, key)) {
          if (!contains(m, hullFor[k])) {
            existHolds = false;
            break;
          }
        }
      }
      if (inConvex[(int) m] != existHolds) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN >= 6) {
      // n == 6 could perhaps be handled with more care with 1L << nOthers
      // n > 6 will not work without considerably more effort
      throw new UnsupportedOperationException();
    }
    final long maxMask = (1L << mN) - 1;
    final long[] allMasks = new long[1 << mN];
    for (int k = 0; k < allMasks.length; ++k) {
      allMasks[k] = k;
    }

    final List<Long> check = new ArrayList<>();
    for (final long m : allMasks) {
      if (Long.bitCount(m) <= 2) {
        check.add(m);
      }
    }
    final long[] checkMasks = new long[check.size()];
    for (int k = 0; k < checkMasks.length; ++k) {
      checkMasks[k] = check.get(k);
    }

    final int nOthers = allMasks.length - 1;
    final long totalConvex = 1L << nOthers;

    final AtomicLong count = new AtomicLong();

    IntStream.range(0, THREADS).parallel().forEach(t -> {
      long local = 0;
      for (long idx = t; idx < totalConvex; idx += THREADS) {
        final long[] convex = new long[Long.bitCount(idx) + 1];
        convex[0] = maxMask;

        int pos = 1;
        for (int j = 0; j < nOthers; ++j) {
          if ((idx & (1L << j)) != 0) {
            convex[pos++] = j;
          }
        }
        if (checkConvex(convex, allMasks, checkMasks, mN)) {
          ++local;
        }
      }
      count.addAndGet(local);
    });

    return Z.valueOf(count.get());
  }
}
