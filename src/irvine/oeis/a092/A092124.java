package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A092124 a(0) = 2, a(n) = (2^(2^n)+2)*a(n-1) for n&gt;0.
 * @author Georg Fischer
 */
public class A092124 extends Sequence0 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A092124() {
    mN = -1;
    mA = Z.TWO;
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Z.ONE.shiftLeft(1 << mN).add(2).multiply(mA);
    }
    return mA;
  }
}
