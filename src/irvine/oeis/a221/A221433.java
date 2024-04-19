package irvine.oeis.a221;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A221433 Number of nX3 1..(max n,3) arrays with each row and column having unrepeated values.
 * @author Sean A. Irvine
 */
public class A221433 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 1 ? Z.SIX : Z.valueOf(12);
    }
    Z sum = Z.ZERO;
    for (int a = 0; a <= mN; ++a) {
      for (int b = 0; a + b <= mN; ++b) {
        final int c = mN - a - b;
        if (a + b + c == mN) {
          sum = sum.signedAdd((b & 1) == 0, Functions.FACTORIAL.z(mN)
            .multiply(Functions.FACTORIAL.z(a))
            .divide(Functions.FACTORIAL.z(c))
            .multiply(Binomial.binomial(3L * a + b + 2, b))
            .shiftLeft(c));
        }
      }
    }
    return sum.multiply(Functions.FACTORIAL.z(mN));
  }
}
