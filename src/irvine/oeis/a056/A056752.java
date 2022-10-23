package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A056752 Distance from n! to the nearest prime.
 * @author Sean A. Irvine
 */
public class A056752 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    if (Z.TWO.equals(f)) {
      return Z.ZERO;
    }
    final Z p = mPrime.prevPrime(f);
    final Z n = mPrime.nextPrime(f);
    return n.subtract(f).min(f.subtract(p));
  }
}
