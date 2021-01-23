package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000621;

/**
 * A036676 Used by Polya in calculating A000598.
 * @author Sean A. Irvine
 */
public class A036676 extends A000621 {

  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  protected final Polynomial<Z> mQ = RING.empty();
  protected int mBonds = -1;

  @Override
  public Z next() {
    ++mBonds;
    mQ.add(super.next());
    final Polynomial<Z> q3 = RING.pow(mQ, 3, mBonds);
    final Polynomial<Z> qqs2 = RING.multiply(RING.multiply(mQ, mQ.substitutePower(2, mBonds), mBonds), Z.THREE);
    final Polynomial<Z> qs3 = RING.multiply(mQ.substitutePower(3, mBonds), Z.TWO);
    return RING.multiply(RING.add(RING.subtract(q3, qqs2), qs3), mQ.shift(1), mBonds).coeff(mBonds).divide(6);
  }
}
