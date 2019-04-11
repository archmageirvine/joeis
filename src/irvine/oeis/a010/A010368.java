package irvine.oeis.a010;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010368 Number of points of L1 norm <code>2n</code> in Hamming code version of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A010368 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 8, 252, 952, 1670, 952, 252, 8, 1);
  private static final Polynomial<Z> DEN = RING.pow(RING.oneMinusXToTheN(1), 8);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
