package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029610 Numbers to the left of the central numbers of the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029610 extends A029600 {

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
