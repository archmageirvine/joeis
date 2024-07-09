package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A071255 a(1) = 2, a(n+1) = a(n)-th squarefree number &gt; 1.
 * @author Sean A. Irvine
 */
public class A071255 extends A005117 {

  private Z mA = Z.ONE;
  private long mM = 0;

  @Override
  public Z next() {
    while (++mM <= mA.longValueExact()) {
      super.next();
    }
    mA = super.next();
    return mA;
  }
}
