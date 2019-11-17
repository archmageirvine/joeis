package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027637 <code>a(n) = Product_{i=1..n} (4^i - 1)</code>.
 * @author Sean A. Irvine
 */
public class A027637 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(2 * mN).subtract(1));
    }
    return mA;
  }
}
