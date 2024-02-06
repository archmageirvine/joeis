package irvine.oeis.a078;

import irvine.math.MemoryFunction1;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068220.
 * @author Sean A. Irvine
 */
public class A078099 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction1<Matrix<Z>> mMat = new MemoryFunction1<>() {
    @Override
    protected Matrix<Z> compute(final int n) {
      if (n <= 1) {
        return new DefaultMatrix<>(new Z[][] {{Z.ONE}}, Z.ZERO);
      }
      final Matrix<Z> m = mMat.get(n - 1);
      final Matrix<Z> mt = m.transpose();
      final DefaultMatrix<Z> res = new DefaultMatrix<>(m.rows() * 2, m.cols() * 2, Z.ZERO);
      for (long k = 0; k < m.rows(); ++k) {
        for (long j = 0; j < m.cols(); ++j) {
          final Z e = m.get(k, j);
          res.set(k, j, e);
          res.set(k + m.rows(), j + m.cols(), e);
          res.set(k, j + m.cols(), mt.get(k, j));
        }
      }
      return res;
    }
  };

  private final MemoryFunction1<Matrix<Z>> mW = new MemoryFunction1<>() {
    @Override
    protected Matrix<Z> compute(final int n) {
      final Matrix<Z> m = mMat.get(n);
      final MatrixRing<Z> ring = new MatrixRing<>(m.rows(), Integers.SINGLETON);
      return ring.add(m, m.transpose());
    }
  };

  private Z sum(final Matrix<Z> m) {
    Z sum = Z.ZERO;
    for (long k = 0; k < m.rows(); ++k) {
      for (long j = 0; j < m.cols(); ++j) {
        sum = sum.add(m.get(k, j));
      }
    }
    return sum;
  }

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.ONE.shiftLeft(m);
    }
    final Matrix<Z> w = mW.get(m);
    final MatrixRing<Z> ring = new MatrixRing<>(w.rows(), Integers.SINGLETON);
    return sum(ring.pow(w, n - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
