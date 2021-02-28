package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a038.A038498;

/**
 * A039800 Column 1 of Inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039800 extends A038498 {

  private long mN = -1;

  @Override
  public Z next() {
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    ++mN;
    return super.next();
  }
}
