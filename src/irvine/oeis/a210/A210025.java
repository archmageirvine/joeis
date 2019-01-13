package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A210025.
 * @author Sean A. Irvine
 */
public class A210025 implements Sequence {

  private Z mA = null;
  private final StringBuilder mDigits = new StringBuilder();
  private int mN = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int d = mDigits.charAt(++mN) - '0';
      final Z t = mA.subtract(d);
      if (t.signum() > 0) {
        mA = t;
      } else {
        mA = mA.add(d);
      }
    }
    mDigits.append(mA.toString());
    return mA;
  }
}
