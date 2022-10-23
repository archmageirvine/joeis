package irvine.oeis.a005;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005312 Maximal sum of inverse squares of the singular values of symmetric anti-Hadamard matrices of order n.
 * @author Sean A. Irvine
 */
public class A005312 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  // Increment symmetric (0,1)-matrix over Q
  private boolean bump(final Matrix<Q> m) {
    final long n = m.rows();
    for (long k = n - 1; k >= 0; --k) {
      for (long j = n - 1; j >= k; --j) {
        final Q v = m.get(k, j);
        if (v == Q.ZERO) {
          m.set(k, j, Q.ONE);
          m.set(j, k, Q.ONE);
          return true;
        } else {
          m.set(k, j, Q.ZERO);
          m.set(j, k, Q.ZERO);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);

    // Iterate over all Boolean matrices
    Q maxMu = Q.ZERO;
    long cnt = 0;
    long notInvertible = 0;
    final Matrix<Q> m = new DefaultMatrix<>(field.zero(), Q.ZERO); // We need a mutable zero
    while (bump(m)) {
      try {
        final Matrix<Q> b = field.inverse(m);
        Q mu = Q.ZERO;
        for (long k = 0; k < mN; ++k) {
          for (long j = 0; j < mN; ++j) {
            mu = mu.add(b.get(k, j).square());
          }
        }
        if (mu.compareTo(maxMu) >= 0) {
          if (mu.compareTo(maxMu) > 0) {
            maxMu = mu;
            cnt = 1;
          } else {
            ++cnt;
          }
        }
      } catch (final IllegalArgumentException e) {
        ++notInvertible;
      }
    }
    if (mVerbose) {
      System.out.println("Not invertible = " + notInvertible + " mu=" + maxMu + " cnt=" + cnt);
    }
    return maxMu.toZ();
  }
}
