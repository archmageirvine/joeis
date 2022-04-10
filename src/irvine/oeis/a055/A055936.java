package irvine.oeis.a055;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A055936 Stereoisomeric homologs with molecular formula C_{3+n} H_{6+2n}.
 * @author Sean A. Irvine
 */
public class A055936 extends A000625 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 6, mN).coeff(mN)
      .add(RING.pow(mB.substitutePower(2, mN), 3, mN).coeff(mN).multiply(3))
      .add(RING.pow(mB.substitutePower(3, mN), 2, mN).coeff(mN).multiply2())
      .divide(6);
  }
}
