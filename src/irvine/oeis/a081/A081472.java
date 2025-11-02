package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081472 a(n) = the smallest (n+k) such that the LCM of numbers from (n+1) to (n+k) is a multiple of n.
 * @author Sean A. Irvine
 */
public class A081472 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    long k = mN;
    do {
      lcm = lcm.lcm(++k);
    } while (lcm.mod(mN) != 0);
    return Z.valueOf(k);
  }
}
