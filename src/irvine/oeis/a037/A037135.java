package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037135 Number of ways of writing n=a+b where |s(a)-a|=|s(b)-b|, s(x)=sigma(x)-x.
 * @author Sean A. Irvine
 */
public class A037135 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN / 2; ++k) {
      final long sa = Functions.SIGMA.l(k) - k;
      final long sb = Functions.SIGMA.l(mN - k) - (mN - k);
      if (Math.abs(sa - k) == Math.abs(mN - k - sb)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
