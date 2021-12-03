package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053000 (Smallest prime &gt; n^2) - n^2.
 * @author Sean A. Irvine
 */
public class A053000 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    return mPrime.nextPrime(n2).subtract(n2);
  }
}

