package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A342053.
 * @author Sean A. Irvine
 */
public class A341923 extends A342053 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a341923(mM, mN - mM);
  }
}
