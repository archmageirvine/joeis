package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013980 Number of commutative elements in Coxeter group <code>F_n</code>.
 * @author Sean A. Irvine
 */
public class A013980 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z res = Fibonacci.fibonacci(3 * mN - 3);
    for (int k = 2; k < mN; ++k) {
      final Z t = Fibonacci.fibonacci(3 * k - 4).multiply(Binomial.catalan(mN - k));
      res = res.subtract(t);
    }
    res = res.multiply(5);
    res = res.add(Binomial.catalan(mN - 1));
    res = res.subtract(Fibonacci.fibonacci(2 * mN - 1).multiply2());
    res = res.subtract(Fibonacci.fibonacci(2 * mN - 3).multiply2());
    res = res.add(Fibonacci.fibonacci(mN));
    return res.subtract(1);
  }
}
