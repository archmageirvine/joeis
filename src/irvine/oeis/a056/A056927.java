package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056927 Difference between n^2 and largest prime less than n^2.
 * @author Sean A. Irvine
 */
public class A056927 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    return n2.subtract(mPrime.prevPrime(n2));
  }
}
