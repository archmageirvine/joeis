package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083935 Inverse function of N -&gt; N injection A083934.
 * @author Sean A. Irvine
 */
public class A083935 extends A083934 {

  private Z mA = super.next();
  private Z mM = Z.NEG_ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (mA.equals(++mN)) {
      mM = mM.add(1);
      mA = super.next();
      return mM;
    }
    return Z.ZERO;
  }
}
