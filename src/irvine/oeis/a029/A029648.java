package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029648 Numbers to the right of the central elements of the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029648 extends A029635 {

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
