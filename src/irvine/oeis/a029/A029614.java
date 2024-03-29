package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029614 Numbers to the right of the central elements of the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029614 extends A029600 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = mN / 2 + 1;
    }
    return get(mN, mM);
  }
}
