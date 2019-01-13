package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003074.
 * @author Sean A. Irvine
 */
public class A003074 extends A003072 {

  private Z mNext = super.next();
  private Z mCount = Z.ZERO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mNext)) {
      mCount = mCount.add(1);
      mNext = super.next();
    }
    return mCount;
  }
}

