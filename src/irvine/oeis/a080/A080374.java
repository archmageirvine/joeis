package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A080374 a(n)=lcm of first n consecutive prime differences.
 * @author Sean A. Irvine
 */
public class A080374 extends A001223 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
