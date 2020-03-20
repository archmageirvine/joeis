package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030060 Third derivative of Catalan generating <code>function/3!</code>.
 * @author Sean A. Irvine
 */
public class A030060 implements Sequence {

  private long mN = -1;
  private Z mA = Z.FIVE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN + 5).multiply(mN + 3).multiply2().divide(mN).divide(mN + 4);
    }
    return mA;
  }
}
