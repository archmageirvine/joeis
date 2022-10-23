package irvine.oeis.a277;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A277357 a(1) = 1; for n &gt; 1, a(n) = (2^n-1)*a(n-1) + 1.
 * @author Georg Fischer
 */
public class A277357 extends Sequence1 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A277357() {
    mN = 0;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    mA = mA.multiply(Z.ONE.shiftLeft(mN).subtract(1)).add(1);
    return mA;
  }
}
