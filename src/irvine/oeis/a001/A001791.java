package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001791 <code>a(n) =</code> binomial coefficient <code>C(2n, n-1)</code>.
 * @author Sean A. Irvine
 */
public class A001791 implements Sequence {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mN <= 1) {
      mA = Z.valueOf(mN);
    } else {
      mA = mA.multiply(mN).multiply(2 * mN - 1).multiply2().divide(Z.valueOf(mN).square().subtract(1));
    }
    return mA;
  }
}
