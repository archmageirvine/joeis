package irvine.oeis.a022;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022290 Replace 2^k in binary expansion of n with Fibonacci(k+2).
 * @author Sean A. Irvine
 */
public class A022290 extends Sequence0 {

  private static final Z[] FIBONACCI = new Z[Long.SIZE];
  static {
    for (int k = 0; k < FIBONACCI.length; ++k) {
      FIBONACCI[k] = Fibonacci.fibonacci(k + 2);
    }
  }

  /**
   * Return the Zeckendorf representation of a number.
   * @param m number
   * @return Zeckendorf representation.
   */
  public static Z zeckendorf(final Z m) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= m.bitLength(); ++k) {
      if (m.testBit(k)) {
        sum = sum.add(FIBONACCI[k]);
      }
    }
    return sum;
  }

  private long mN = -1;

  @Override
  public Z next() {
    return zeckendorf(Z.valueOf(++mN));
  }
}
