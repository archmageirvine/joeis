package irvine.oeis.a144;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A144084 T(n,k) is the number of partial bijections of height k (height(alpha) = |Im(alpha)|) of an n-element set.
 * T:= (n, k) -&gt; (binomial(n, k)^2)*k!:
 * @author Georg Fischer
 */
public class A144084 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n, k).square().multiply(MemoryFactorial.SINGLETON.factorial(k));
  }
}
