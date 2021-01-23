package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037135 Number of ways of writing n=a+b where |s(a)-a|=|s(b)-b|, s(x)=sigma(x)-x.
 * @author Sean A. Irvine
 */
public class A037135 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN / 2; ++k) {
      final long sa = Cheetah.factor(k).sigma().longValueExact() - k;
      final long sb = Cheetah.factor(mN - k).sigma().longValueExact() - (mN - k);
      if (Math.abs(sa - k) == Math.abs(mN - k - sb)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
