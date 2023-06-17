package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028379 a(n) = 6*(n+1)*(2*n+6)!/((n+3)!*(n+5)!).
 * @author Sean A. Irvine
 */
public class A028379 extends AbstractSequence {

  /** Construct the sequence. */
  public A028379() {
    super(-1);
  }

  private long mN = -1;
  private Z mA = Z.SIX;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      mA = mA.multiply(2 * mN + 3).multiply(mN).multiply2().divide(mN - 1).divide(mN + 4);
    }
    return mA;
  }
}
