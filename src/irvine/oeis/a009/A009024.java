package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a003.A003703;

/**
 * A009024 Expansion of e.g.f.: <code>x*cos(log(1+x))</code>.
 * @author Sean A. Irvine
 */
public class A009024 extends A003703 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN + 1);
  }
}
