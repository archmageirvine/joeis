package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A036678 Used by Polya in calculating A000598.
 * @author Sean A. Irvine
 */
public class A036678 extends A036677 {

  private final Polynomial<Z> mM = RING.empty();

  @Override
  public Z next() {
    mM.add(super.next());
    final Polynomial<Z> pp2 = RING.multiply(RING.multiply(mP, mP.substitutePower(2, mBonds), mBonds), Z.TWO);
    final Polynomial<Z> mqq = RING.multiply(RING.subtract(RING.pow(mQ, 2, mBonds), mQ.substitutePower(2, mBonds)), mM, mBonds);
    final Polynomial<Z> qpp = RING.multiply(RING.subtract(RING.pow(mP, 2, mBonds), mP.substitutePower(2, mBonds)), mQ, mBonds);
    return RING.multiply(RING.add(RING.add(pp2, mqq), qpp), mQ.shift(1), mBonds).coeff(mBonds).divide2();
  }
}
