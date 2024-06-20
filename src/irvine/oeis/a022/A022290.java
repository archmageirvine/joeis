package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A022290 Replace 2^k in binary expansion of n with Fibonacci(k+2).
 * @author Sean A. Irvine
 */
public class A022290 extends Sequence0 implements DirectSequence {

  private static final Z[] FIBONACCI = new Z[Long.SIZE];
  static {
    for (int k = 0; k < FIBONACCI.length; ++k) {
      FIBONACCI[k] = Functions.FIBONACCI.z(k + 2);
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

  @Override
  public Z a(final Z n) {
    return zeckendorf(n);
  }

  @Override
  public Z a(final int n) {
    return zeckendorf(Z.valueOf(n));
  }

}
