package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037134 Number of ways of writing n as a+b where a is abundant (or perfect), b is deficient (or perfect) and s(a)-a=b-s(b) (s(x)=sigma(x)-x).
 * @author Sean A. Irvine
 */
public class A037134 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN / 2; ++k) {
      final long sa = Functions.SIGMA1.l(k) - k;
      final long sb = Functions.SIGMA1.l(mN - k) - (mN - k);
      if (sa - k == mN - k - sb) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
