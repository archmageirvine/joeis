package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002690 <code>a(n) = (n+1) * (2*n)! / n!</code>.
 * @author Sean A. Irvine
 */
public class A002690 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1).divide(mN);
    }
    return mA.multiply(mN + 1);
  }
}
