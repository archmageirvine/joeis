package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000801.
 * @author Sean A. Irvine
 */
public class A000801 extends A000799 {

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(super.next());
    return mS;
  }
}
