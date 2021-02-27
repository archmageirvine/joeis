package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a038.A038498;

/**
 * A039804.
 * @author Sean A. Irvine
 */
public class A039804 extends A038498 {

  private long mN = 3;
  {
    for (int k = 0; k < 11; ++k) {
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
