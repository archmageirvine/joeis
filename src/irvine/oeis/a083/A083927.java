package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a057.A057123;

/**
 * A083927 Inverse function of N -&gt; N injection A057123.
 * @author Sean A. Irvine
 */
public class A083927 extends A057123 {

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
