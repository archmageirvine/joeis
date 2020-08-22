package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029662 Numbers to the left of the central numbers of the (2,1)-Pascal triangle A029653.
 * @author Sean A. Irvine
 */
public class A029662 extends A029653 {

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
