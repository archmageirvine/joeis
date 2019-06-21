package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A024171 Integer part of <code>((4th</code> elementary symmetric function of <code>1,2,...,n)/(1+2+...+n))</code>.
 * @author Sean A. Irvine
 */
public class A024171 extends A000217 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      super.next();
      return Z.ZERO;
    }
    return Stirling.firstKind(mN + 1, mN - 3).divide(super.next());
  }
}
