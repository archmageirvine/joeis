package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a071.A071156;

/**
 * A085199 Inverse function of N -&gt; N injection A071156.
 * @author Sean A. Irvine
 */
public class A085199 extends A071156 {

  private Z mA = super.next();
  private Z mN = Z.NEG_ONE;
  private long mM = -1;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mA = super.next();
      return Z.valueOf(++mM);
    }
    return Z.ZERO;
  }
}
