package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A070428.
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
