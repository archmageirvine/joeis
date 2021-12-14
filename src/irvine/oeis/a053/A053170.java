package irvine.oeis.a053;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053170.
 * @author Sean A. Irvine
 */
public class A053170 implements Sequence {

  // Ralf confirms ordinary matrix multiplication

  private static final MatrixRing<Z> M = new MatrixRing<>(3, Integers.SINGLETON);
  private int mN = 0;

  private boolean isFinite(final Matrix<Z> m, final Z max) {
    System.out.println(m);
    Matrix<Z> t = m;
    final HashSet<Matrix<Z>> seen = new HashSet<>();
    while (!t.equals(M.one()) && !t.equals(M.zero())) {
      t = M.multiply(t, m);
      for (int k = 0; k < 3; ++k) {
        for (int j = 0; j < 3; ++j) {
          if (t.get(k, j).abs().compareTo(max) > 0) {
            return false;
          }
        }
      }
      if (!seen.add(t)) {
        return false;
      }
//      if (seen.size() > 10) {
//        System.out.println("Stuck? on " + t + " * " + m);
//      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    System.out.println("Start n=" + mN);
    final Z zn = Z.valueOf(mN);
    long count = 0;
    final MatrixRing<Z> ring = new MatrixRing<>(3, new IntegersMod(2L * mN + 1));
    final Matrix<Z> m = new DefaultMatrix<>(3, 3, Z.ZERO);
    for (final Matrix<Z> mat : ring) {
      // Convert to +/- form
      for (int k = 0; k < 3; ++k) {
        for (int j = 0; j < 3; ++j) {
          m.set(k, j, mat.get(k, j).subtract(mN));
        }
      }
      if (isFinite(m, zn)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
