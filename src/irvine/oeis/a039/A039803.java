package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a038.A038498;

/**
 * A039803.
 * @author Sean A. Irvine
 */
public class A039803 extends A038498 {

  private long mN = 2;
  {
    for (int k = 0; k < 7; ++k) {
      super.next();
    }
  }

  @Override
  public Z next() {
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    ++mN;
    return super.next();
  }
}
