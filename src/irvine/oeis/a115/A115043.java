package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115043 a(0)=3, a(1)=5. a(n) = a(n-1)*a(n-2) if n odd, else a(n) = a(n-1)/a(n-2).
 * @author Georg Fischer
 */
public class A115043 extends Sequence0 {

  private int mN = -1;
  private Z mA1;
  private Z mA2;

  /** Construct the sequence. */
  public A115043() {
    mA2 = Z.THREE;
    mA1 = Z.FIVE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA2;
    }
    if (mN == 1) {
      return mA1;
    }
    final Z result = ((mN & 1) == 0) ? mA1.multiply(mA2) : mA1.divide(mA2);
    mA2 = mA1;
    mA1 = result;
    return result;
  }
}
