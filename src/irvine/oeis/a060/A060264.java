package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060264 First prime after 2n.
 * @author Sean A. Irvine
 */
public class A060264 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mPrime.nextPrime(mN));
  }
}
