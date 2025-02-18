package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075348 Group the natural numbers such that the n-th group contains n terms and the group sum is the smallest possible prime.
 * @author Sean A. Irvine
 */
public class A075348 extends A075345 {

  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mBestList.length) {
      super.next();
      mM = 0;
    }
    return Z.valueOf(mBestList[mM]);
  }
}
