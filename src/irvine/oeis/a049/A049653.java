package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049653 a(n) = 2*n - prevprime(2*n).
 * @author Sean A. Irvine
 */
public class A049653 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN - mPrime.prevPrime(mN));
  }
}
