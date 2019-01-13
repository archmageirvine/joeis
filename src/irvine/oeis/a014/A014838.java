package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014838.
 * @author Sean A. Irvine
 */
public class A014838 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; base = mPrime.nextPrime(base)) {
      sum += ZUtils.digitSum(mN, base);
    }
    return Z.valueOf(sum);
  }
}
