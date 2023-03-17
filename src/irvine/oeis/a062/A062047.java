package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062047 Sum of odd numbers between consecutive primes.
 * @author Sean A. Irvine
 */
public class A062047 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    return mP.add(q).multiply(mP.subtract(q).subtract(2)).divide(4).max(Z.ZERO);
  }
}

