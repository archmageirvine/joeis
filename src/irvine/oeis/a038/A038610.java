package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038610 Least common multiple of integers less than and prime to <code>n</code>.
 * @author Sean A. Irvine
 */
public class A038610 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (int k = 2; k < mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        lcm = lcm.lcm(Z.valueOf(k));
      }
    }
    return lcm;
  }
}

