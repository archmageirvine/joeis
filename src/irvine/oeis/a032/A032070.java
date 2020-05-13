package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032070.
 * @author Sean A. Irvine
 */
public class A032070 extends A032086 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
