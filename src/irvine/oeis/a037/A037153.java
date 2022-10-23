package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A037153 a(n) = p-n!, where p is the smallest prime &gt; n!+1.
 * @author Sean A. Irvine
 */
public class A037153 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final Z p = mPrime.nextPrime(f.add(1));
    return p.subtract(f);
  }
}
