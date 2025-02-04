package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074934 Number of integers in {1, 2, ..., Fibonacci(n)} that are coprime to n.
 * @author Sean A. Irvine
 */
public class A074934 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    final Z[] qr = Functions.FIBONACCI.z(mN).divideAndRemainder(mN);
    final long r = qr[1].longValueExact();
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(qr[0]);
        if (k <= r) {
          sum = sum.add(1);
        }
      }
    }
    return sum;
  }
}
