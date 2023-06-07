package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064007 At step n in computing A064413, sequence gives smallest multiple of 3 not yet seen, divided by 3.
 * @author Sean A. Irvine
 */
public class A064007 extends A064413 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    super.next();
    while (mSeen.contains(mN)) {
      mN = mN.add(3);
    }
    return mN.divide(3);
  }
}
