package irvine.oeis.a035;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A035010 Number of prime binary rooted trees with n external nodes.
 * @author Sean A. Irvine
 */
public class A035010 extends MemorySequence {

  {
    add(null); // 0
    add(null); // 1
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z res = Binomial.catalan(n - 1);
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d > 1 && d < n) {
        res = res.subtract(get(d).multiply(Binomial.catalan(n / d - 1)));
      }
    }
    return res;
  }
}
