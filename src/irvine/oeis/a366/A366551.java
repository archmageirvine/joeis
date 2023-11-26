package irvine.oeis.a366;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A366551.
 * @author Sean A. Irvine
 */
public class A366551 extends Sequence0 {

  private static final MatrixRing<Z> RING = new MatrixRing<>(3, Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final HashSet<Polynomial<Z>> charPolys = new HashSet<>();
    final MatrixRing<Z> r = new MatrixRing<>(3, new IntegersMod(++mN));
    for (final Matrix<Z> m : r) {
      charPolys.add(RING.characteristicPolynomial(m));
    }
    return Z.valueOf(charPolys.size());
  }
}
