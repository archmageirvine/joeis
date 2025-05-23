package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075347 Final terms of groups in A075345.
 * @author Sean A. Irvine
 */
public class A075347 extends A075345 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mBestList[mBestList.length - 1]);
  }
}
