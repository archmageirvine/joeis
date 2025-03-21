package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074496 a(n) = smallest prime &gt; e^n.
 * @author Sean A. Irvine
 */
public class A074496 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return mPrime.nextPrime(CR.valueOf(++mN).exp().floor());
  }
}
