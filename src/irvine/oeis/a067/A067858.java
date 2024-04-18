package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067858 J_n(n), where J is the Jordan function, J_n(n) = n^n product{p|n}(1 - 1/p^n), the product is over the distinct primes, p, dividing n.
 * @author Georg Fischer
 */
public class A067858 extends Sequence1 {

  protected long mN;
  
  /** Construct the sequence. */
  public A067858() {
    mN = 0;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.pow(mN).multiply(Functions.MOBIUS.i(mN / d.longValue())));
    }
    return sum;
  }
}
