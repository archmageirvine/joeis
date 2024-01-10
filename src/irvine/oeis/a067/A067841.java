package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067841 Numbers n such that n and prime(n) end with the same three digits.
 * @author Sean A. Irvine
 */
public class A067841 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 1000 == super.next().mod(1000)) {
        return Z.valueOf(mN);
      }
    }
  }
}
