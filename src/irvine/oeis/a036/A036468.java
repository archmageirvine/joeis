package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036468 Number of ways to represent 2n+1 as a+b with 0 &lt; a &lt; b and a^2 + b^2 prime.
 * @author Sean A. Irvine
 */
public class A036468 extends A000040 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long a = 1; a <= mN / 2; ++a) {
      if (Z.valueOf(a).square().add(Z.valueOf(mN - a).square()).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
