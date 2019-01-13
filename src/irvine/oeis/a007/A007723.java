package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a011.A011804;

/**
 * A007723.
 * @author Sean A. Irvine
 */
public class A007723 extends A011804 {

  private int mN = -2;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 0;
    }
    return m(mN - mM + 1, mM - 1);
  }
}
