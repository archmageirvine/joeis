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
 * A366551 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A366551 extends Sequence0 {

  private static final int SIZE = 3;
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
