package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067838 Numbers n such that n and prime(n) end with the same two digits.
 * @author Sean A. Irvine
 */
public class A067838 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 100 == super.next().mod(100)) {
        return Z.valueOf(mN);
      }
    }
  }
}
