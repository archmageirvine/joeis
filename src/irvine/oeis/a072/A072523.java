package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072523 Sum of remainders when n-th Fibonacci number is divided by all smaller Fibonacci numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A072523 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FIBONACCI.z(++mN);
    Z sum = Z.ZERO;
    for (int k = 3; k < mN; ++k) {
      sum = sum.add(f.mod(Functions.FIBONACCI.z(k)));
    }
    return sum;
  }
}
