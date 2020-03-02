package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029644 Numbers to the left of the central numbers of the <code>(1,2)-Pascal</code> triangle <code>A029635</code>.
 * @author Sean A. Irvine
 */
public class A029644 extends A029635 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
