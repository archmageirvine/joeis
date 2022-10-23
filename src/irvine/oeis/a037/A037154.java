package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A037154 Largest prime &lt; n!-1.
 * @author Sean A. Irvine
 */
public class A037154 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(3);
    super.next(); // skip 0!
    super.next(); // skip 1!
    super.next(); // skip 2!
  }

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next().subtract(1));
  }
}
