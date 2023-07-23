package irvine.oeis.a005;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A005961 Number of acyclic disubstituted alkanes with n carbon atoms and identical substituents.
 * @author Sean A. Irvine
 */
public class A005961 extends A005960 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z xy = super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> b = RING.subtract(RING.one(), a.substitutePower(2, mN).shift(1));
    return xy.add(RING.coeff(RING.one(), b, mN)).divide2();
  }
}
