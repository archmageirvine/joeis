package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A067365 a(n) = p-n!^5, where p is the smallest prime &gt; n!^5+1.
 * @author Sean A. Irvine
 */
public class A067365 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = mF.next().pow(5);
    return mPrime.nextPrime(f.add(1)).subtract(f);
  }
}
