package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A248545 a(n+1) = a(n)^2 + 75.
 * @author Georg Fischer
 */
public class A248545 extends Sequence0 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A248545() {
    mN = -1;
    mA = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    mA = mA.square().add(75);
    return mA;
  }
}
