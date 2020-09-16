package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A058768 McKay-Thompson series of class 94A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058768 extends A058690 {

  private final Polynomial<Z> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT.add(super.next());
    final Polynomial<Z> t2 = mT.substitutePower(2, mN);
    final Polynomial<Z> a = RING.add(RING.add(mT.shift(1), t2).shift(1), RING.multiply(mT, t2, mN)); // scaled by q^3
    final Polynomial<Z> b = RING.add(RING.add(RING.x(), mT).shift(1), t2); // scaled by q^2
    return RING.coeff(a, b, mN);
  }
}
