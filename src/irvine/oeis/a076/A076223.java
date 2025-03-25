package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076221.
 * @author Sean A. Irvine
 */
public class A076223 extends A076221 {

  private long mN = 0;

  @Override
  public Z next() {
    Z min = Z.valueOf(++mN);
    for (long k = 0; k < mN; ++k) {
      min = min.min(super.next());
    }
    return min;
  }
}
