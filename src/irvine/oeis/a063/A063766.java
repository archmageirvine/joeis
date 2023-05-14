package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000400;

/**
 * A063766 a(n) is the smallest prime &gt;= 6^n.
 * @author Sean A. Irvine
 */
public class A063766 extends A000400 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
