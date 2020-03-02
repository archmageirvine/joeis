package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029666 Numbers to the right of the central elements of the <code>(2,1)-Pascal</code> triangle <code>A029653</code>.
 * @author Sean A. Irvine
 */
public class A029666 extends A029653 {

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
