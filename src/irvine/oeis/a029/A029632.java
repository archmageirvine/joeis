package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029632 Numbers to right of central elements of the (3,2)-Pascal triangle A029618.
 * @author Sean A. Irvine
 */
public class A029632 extends A029618 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = mN / 2 + 1;
    }
    return get(mN, mM);
  }
}
