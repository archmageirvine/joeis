package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005326.
 * @author Sean A. Irvine
 */
public class A005326 implements Sequence {

  private int mN = 0;

  private Matrix<Z> buildMatrix(final int n) {
    final MatrixRing<Z> ring = new MatrixRing<>(n, Integers.SINGLETON);
    final Matrix<Z> comprimeMatrix = new DefaultMatrix<>(ring.zero(), Z.ZERO);
    for (int k = 1; k <= n; ++k) {
      for (int j = k; j <= n; ++j) {
        final Z d = LongUtils.gcd(j, k) == 1 ? Z.ONE : Z.ZERO;
        comprimeMatrix.set(k - 1, j - 1, d);
        comprimeMatrix.set(j - 1, k - 1, d);
      }
    }
    return comprimeMatrix;
  }

  private int valuation2(final long k) {
    int j = 0;
    long i = k;
    while ((i & 1) == 0) {
      ++j;
      i >>>= 1;
    }
    return j;
  }

  private Q prod(final Q[] x) {
    Q p = Q.ONE;
    for (final Q v : x) {
      p = p.multiply(v);
    }
    return p;
  }

  // Faster permanent after Herman Jamke

  protected Z permanent(final int n) {
    final Matrix<Z> a = buildMatrix(n);
    // final MatrixRing<Z> ring = new MatrixRing<>(n, Integers.SINGLETON);
    // return ring.permanent(a);
    if (n == 1) {
      return a.get(0, 0);
    }
    boolean sg = true;
    final Q[] in = new Q[n];
    Arrays.fill(in, Q.ZERO);
    final Z[] b = new Z[n];
    Arrays.fill(b, Z.ZERO);
    for (int j = 0; j < n; ++j) {
      for (int k = 0; k < n; ++k) {
        b[j] = b[j].add(a.get(k, j));
      }
    }

    final Q[] x = new Q[n];
    for (int k = 0; k < n; ++k) {
      x[k] = new Q(a.get(k, n - 1)).subtract(new Q(b[k], Z.TWO));
    }
    Q p = prod(x);
    for (long k = 1; k < 1L << (n - 1); ++k) {
      sg = !sg;
      final int j = valuation2(k);
      final Q z = Q.ONE.subtract(in[j].multiply(2));
      in[j] = in[j].add(z);
      for (int i = 0; i < x.length; ++i) {
        x[i] = x[i].add(z.multiply(a.get(i, j)));
      }
      p = p.signedAdd(sg, prod(x));
    }
    return p.multiply(2 * (2 * (mN & 1) - 1)).toZ();
  }

  @Override
  public Z next() {
    return permanent(++mN);
  }
}

