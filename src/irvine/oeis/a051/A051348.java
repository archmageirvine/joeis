package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051348 F_n/product{p|n}[ F_p ], where F_k is k-th Fibonacci number and the p's in product are the distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A051348 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z f = Fibonacci.fibonacci(++mN);
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      f = f.divide(Fibonacci.fibonacci(p.intValue()));
    }
    return f;
  }
}
