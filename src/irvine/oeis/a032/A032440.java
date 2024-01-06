package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A032440 Sum_{i=0..3} binomial(Fibonacci(n),i).
 * @author Sean A. Irvine
 */
public class A032440 extends A000045 {

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final Z fibo = super.next();
    for (long k = 0; k <= 3; ++k) {
      sum = sum.add(Binomial.binomial(fibo, Z.valueOf(k)));
    }
    return sum;
  }
}
