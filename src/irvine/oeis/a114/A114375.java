package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A114375 a(n) = (a(n-1) XOR a(n-2)) + 1, a(0) = a(1) = 0.
 * @author Georg Fischer
 */
public class A114375 extends Sequence0 {

  private int mN = -1;
  private Z mA1;
  private Z mA2;

  /** Construct the sequence. */
  public A114375() {
    mA1 = Z.ZERO;
    mA2 = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ZERO;
    }
    final Z result = mA1.xor(mA2).add(1);
    mA2 = mA1;
    mA1 = result;
    return result;
  }
}
