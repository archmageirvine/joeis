package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032071.
 * @author Sean A. Irvine
 */
public class A032071 extends A032087 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
