package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075346 extends A075345 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mBestList[0]);
  }
}
