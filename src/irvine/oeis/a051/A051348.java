package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051348 a(n) = F(n) / Product_{p|n} F(p), where F(k) is k-th Fibonacci number and the p's in product are the distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A051348 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z f = Functions.FIBONACCI.z(++mN);
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      f = f.divide(Functions.FIBONACCI.z(p));
    }
    return f;
  }
}
