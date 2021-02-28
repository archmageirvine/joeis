package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a038.A038498;

/**
 * A039802 Column 3 of Inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039802 extends A038498 {

  private long mN = 1;
  {
    super.next();
    super.next();
    super.next();
    super.next();
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
