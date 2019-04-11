package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001756 Expansion of <code>an</code> integral.
 * @author Sean A. Irvine
 */
public class A001756 implements Sequence {

  private long mN = 2;
  private Z mA = Z.valueOf(15);

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(mN).multiply(2 * mN - 7).divide(mN - 3);
    }
    return mA;
  }
}
