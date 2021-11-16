package irvine.oeis.a052;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A052326 Number of asymmetric trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A052326 extends A052325 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  {
   mB.add(Z.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    mB.add(super.next());
    if (++mN <= 10) {
      return mN <= 1 ? Z.ONE : Z.ZERO;
    }
    final Z t = mB.substitutePower(2, mN).coeff(mN).add(RING.pow(mB, 2, mN).coeff(mN)).divide2();
    return mB.get(mN).subtract(t);
  }
}
