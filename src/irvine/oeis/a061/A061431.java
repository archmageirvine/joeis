package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061431 a(n) = LCM of the n consecutive numbers n(n-1)/2 + 1, ..., n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A061431 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 0, s = mN * (mN - 1) / 2 + 1; k < mN; ++k, ++s) {
      lcm = lcm.lcm(Z.valueOf(s));
    }
    return lcm;
  }
}

