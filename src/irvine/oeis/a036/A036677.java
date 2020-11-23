package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A036677 Used by Polya in calculating A000598.
 * @author Sean A. Irvine
 */
public class A036677 extends A036676 {

  protected final Polynomial<Z> mP = RING.empty();

  @Override
  public Z next() {
    mP.add(super.next());
    final Polynomial<Z> qps2 = RING.multiply(RING.multiply(mQ, mP.substitutePower(2, mBonds), mBonds), Z.TWO);
    final Polynomial<Z> t = RING.multiply(RING.subtract(RING.pow(mQ, 2, mBonds), mQ.substitutePower(2, mBonds)), mP, mBonds);
    return RING.multiply(RING.add(qps2, t), mQ.shift(1), mBonds).coeff(mBonds).divide2();
  }
}
