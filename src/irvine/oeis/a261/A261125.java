package irvine.oeis.a261;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A261125 a(n) = (2^(n-1))!*a(n-1) for n&gt;=1, a(0) = 1.
 * @author Georg Fischer
 */
public class A261125 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mA = mA.multiply(Functions.FACTORIAL.z(Z.ONE.shiftLeft(mN - 1)));
    return mA;
  }
}
