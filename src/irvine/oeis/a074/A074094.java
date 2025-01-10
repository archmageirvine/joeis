package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A074094 a(1) = 1; for n &gt; 1, a(n) = LCM of next n composite numbers.
 * @author Sean A. Irvine
 */
public class A074094 extends A018252 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      lcm = lcm.lcm(super.next());
    }
    return lcm;
  }
}
