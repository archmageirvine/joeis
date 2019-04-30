package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005329 <code>a(n) = Product_{i=1..n} (2^i - 1)</code>. Also called 2-factorial numbers.
 * @author Sean A. Irvine
 */
public class A005329 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).subtract(1));
    }
    return mA;
  }
}
