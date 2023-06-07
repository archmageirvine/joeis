package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064004 At step n in computing A064413, sequence gives smallest multiple of 2 not yet seen, divided by 2.
 * @author Sean A. Irvine
 */
public class A064004 extends A064413 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    super.next();
    while (mSeen.contains(mN)) {
      mN = mN.add(2);
    }
    return mN.divide2();
  }
}
