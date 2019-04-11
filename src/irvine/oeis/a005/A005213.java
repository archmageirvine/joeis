package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002426;

/**
 * A005213 Number of symmetric, reduced unit interval schemes with <code>n+1</code> intervals <code>(n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A005213 extends A002426 {

  private long mN = -1;
  private Z mA = super.next();

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return mA;
    }
    final Z t = super.next();
    final Z r = t.subtract(mA).divide2();
    mA = t;
    return r;
  }
}
