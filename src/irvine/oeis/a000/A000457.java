package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000457.
 * @author Sean A. Irvine
 */
public class A000457 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ONE;
    for (long k = 5; k <= 2 * mN + 3; k += 2) {
      r = r.multiply(k);
    }
    return r.multiply(mN + 1);
  }
}
