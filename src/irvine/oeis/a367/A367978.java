package irvine.oeis.a367;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A367978 Number of distinct characteristic polynomials for 4 X 4 matrices with entries from {0, 1, ..., n}.
 * @author Sean A. Irvine
 */
public class A367978 extends Sequence0 {

  private static final int SIZE = 4;
  private static final MatrixRing<Z> RING = new MatrixRing<>(SIZE, Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final HashSet<Polynomial<Z>> charPolys = new HashSet<>();
    for (final Matrix<Z> m : new MatrixRing<>(SIZE, new IntegersMod(++mN))) {
      charPolys.add(RING.characteristicPolynomial(m));
    }
    return Z.valueOf(charPolys.size());
  }
}
