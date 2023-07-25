package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064737 Fibonacci sequence (A000045) mod 10 with carry.
 * @author Sean A. Irvine
 */
public class A064737 extends Sequence0 {

  private long mA = -1;
  private long mB = -1;
  private long mC = -1;

  @Override
  public Z next() {
    if (mA < 0) {
      mA = 0;
      return Z.ZERO;
    } else if (mB < 0) {
      mB = 1;
      return Z.ONE;
    } else if (mC < 0) {
      mC = 1;
      return Z.ONE;
    } else {
      final long carry = mA + mB >= 10 ? 1 : 0;
      mA = mB;
      mB = mC;
      mC = (mA + mB) % 10 + carry;
      return Z.valueOf(mC);
    }
  }
}

