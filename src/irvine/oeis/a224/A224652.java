package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.a006.A006219;

/**
 * A224652.
 * @author Sean A. Irvine
 */
public class A224652 extends A006219 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 1;
      ++mN;
    }
    return f(mN, mM);
  }
}
