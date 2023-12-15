package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067391 a(n) is the least common multiple of numbers in {1,2,3,...,n-1} which do not divide n.
 * @author Sean A. Irvine
 */
public class A067391 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 2; k < mN; ++k) {
      if (mN % k != 0) {
        lcm = lcm.lcm(k);
      }
    }
    return lcm;
  }
}

