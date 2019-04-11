package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003518 <code>a(n) =</code> 8*binomial(2*n+1,n-3)/(n+5).
 * @author Sean A. Irvine
 */
public class A003518 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 2;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(2 * mN + 1).multiply(2 * mN).divide(mN + 5).divide(mN - 3);
    }
    return mA;
  }
}
