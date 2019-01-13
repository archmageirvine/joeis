package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081549.
 * @author Sean A. Irvine
 */
public class A081549 implements Sequence {

  private int mLastDigit = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    Z n = Z.ZERO;
    while (n.compareTo(mA) <= 0) {
      if (++mLastDigit == 10) {
        mLastDigit = 1;
      }
      n = n.multiply(10).add(mLastDigit);
    }
    mA = n;
    return n;
  }
}

