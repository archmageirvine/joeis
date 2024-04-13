package irvine.oeis.a102;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A102119 Iccanobirt numbers (9 of 15): a(n) = R(a(n-1) + a(n-2) + R(a(n-3))), where R is the digit reversal function A004086.
 * @author Georg Fischer
 */
public class A102119 extends Sequence0 {

  protected int mN = -1;
  protected Z mA = Z.ONE; // a(n-1)
  protected Z mB = Z.ZERO; // a(n-2)
  protected Z mC = Z.ZERO; // a(n-3)

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ZERO;
    } else if (mN == 2) {
      return Z.ONE;
    }
    final Z result = Functions.REVERSE.z(mA.add(mB).add(Functions.REVERSE.z(mC)));
    mC = mB;
    mB = mA;
    mA = result;
    return result;
  }
}
