package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029628 Numbers to left of central numbers of the (3,2)-Pascal triangle A029618.
 * @author Sean A. Irvine
 */
public class A029628 extends A029618 {

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
