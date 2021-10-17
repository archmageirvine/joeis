package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029644 Numbers to the left of the central numbers of the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029644 extends A029635 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
