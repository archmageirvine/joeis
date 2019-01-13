package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a027.A027834;

/**
 * A006691.
 * @author Sean A. Irvine
 */
public class A006691 extends A027834 {

  private Z mF = Z.ONE;
  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().divide(mF);
  }
}

