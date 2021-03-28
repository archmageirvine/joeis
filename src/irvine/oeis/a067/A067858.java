package irvine.oeis.a067;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067858 J_n(n), where J is the Jordan function, J_n(n) = n^n product{p|n}(1 - 1/p^n), the product is over the distinct primes, p, dividing n.
 * @author Georg Fischer
 */
public class A067858 implements Sequence {

  protected long mN;
  
  /** Construct the sequence */
  public A067858() {
    mN = 0;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(d.pow(mN).multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
