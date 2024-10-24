package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072555.
 * @author Sean A. Irvine
 */
public class A072746 extends A072742 {

  private Z mN = Z.ZERO;
  private Z mP = super.next();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mP)) {
      mCount = mCount.add(1);
      mP = super.next();
    }
    return mCount;
  }
}
