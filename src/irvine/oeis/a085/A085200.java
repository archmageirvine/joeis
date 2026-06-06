package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a071.A071155;
import irvine.oeis.a071.A071156;

/**
 * A085200 Inverse function of N -&gt; N injection A071155.
 * @author Sean A. Irvine
 */
public class A085200 extends A071156 {

  private final DirectSequence mS = DirectSequence.create(new A071155());
  private Z mA = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      long m = 0;
      while (!mN.equals(mS.a(m))) {
        ++m;
      }
      mA = super.next();
      return Z.valueOf(m);
    }
    return Z.ZERO;
  }
}
