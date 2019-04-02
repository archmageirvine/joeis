package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014783 Triangle of numbers associated with Genocchi numbers.
 * @author Sean A. Irvine
 */
public class A014783 extends A014780 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    mM += 2;
    if (mM > 2 * mN) {
      ++mN;
      mM = 3;
    }
    return get(mN, mM);
  }
}
