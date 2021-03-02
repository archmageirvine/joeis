package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A039945 Maris-McGwire numbers(2): numbers k such that f(k) = f(k+1), where f(k) = sum of digits of k + sum of digits of the distinct prime factors of k.
 * @author Sean A. Irvine
 */
public class A039945 implements Sequence {

  private long mN = 2;

  private long f(final long k) {
    long sum = ZUtils.digitSum(k);
    for (final Z p : Cheetah.factor(k).toZArray()) {
      sum += ZUtils.digitSum(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (f(++mN) == f(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
