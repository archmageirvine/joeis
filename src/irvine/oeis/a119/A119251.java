package irvine.oeis.a119;
// manually robots/union2 at 2023-08-15 15:43

import irvine.math.z.Z;
import irvine.oeis.a056.A056169;

/**
 * A119251 Positive integers each with exactly 1 unitary prime divisor (i.e., n is included if and only if A056169(n) = 1).
 * @author Georg Fischer
 */
public class A119251 extends A056169 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
