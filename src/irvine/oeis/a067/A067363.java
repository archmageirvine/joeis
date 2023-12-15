package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000442;

/**
 * A067363 a(n)=p-n!^3, where p is the smallest prime &gt; n!^3+1.
 * @author Sean A. Irvine
 */
public class A067363 extends Sequence1 {

  private final Sequence mF2 = new A000442().skip();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f2 = mF2.next();
    return mPrime.nextPrime(f2.add(1)).subtract(f2);
  }
}
