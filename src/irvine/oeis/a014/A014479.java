package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014479 Exponential generating function <code>= (1+2*x)/(1-2*x)^3</code>.
 * @author Sean A. Irvine
 */
public class A014479 extends A014477 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
