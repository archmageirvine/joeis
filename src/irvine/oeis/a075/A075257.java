package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075257 extends Sequence1 {

  private Z mA = null;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    final Z min = mA.min(mB);
    final Z a = mA.max(mB).subtract(min);
    final Z b = min.multiply(3);
    if (a.compareTo(b) < 0) {
      mA = a;
      mB = b;
    } else {
      mA = b;
      mB = a;
    }
    return mA;
  }
}
