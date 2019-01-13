package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001616.
 * @author Sean A. Irvine
 */
public class A001616 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum += LongUtils.phi(LongUtils.gcd(d, mN / d));
    }
    return Z.valueOf(sum);
  }
}
