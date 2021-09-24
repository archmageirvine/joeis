package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A051656 Sum_{i=0..n} (C(n,i) mod 2)*Fibonacci(2*i).
 * @author Sean A. Irvine
 */
public class A051656 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Sequence fibo = new A000045();
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(fibo.next().multiply(Binomial.binomial(mN, k, 2)));
      fibo.next();
    }
    return sum;
  }
}
