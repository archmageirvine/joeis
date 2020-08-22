package irvine.oeis.a022;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022290 Replace 2^k in binary expansion of n with Fibonacci(k+2).
 * @author Sean A. Irvine
 */
public class A022290 implements Sequence {

  private static final Z[] FIBONACCI = new Z[Long.SIZE];
  static {
    for (int k = 0; k < FIBONACCI.length; ++k) {
      FIBONACCI[k] = Fibonacci.fibonacci(k + 2);
    }
  }

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z sum = Z.ZERO;
    int k = 0;
    while (m != 0) {
      if ((m & 1) != 0) {
        sum = sum.add(FIBONACCI[k]);
      }
      ++k;
      m >>>= 1;
    }
    return sum;
  }
}
