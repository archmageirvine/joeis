package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066841 a(n) = Product{k|n} k^(n/k); product is over the positive divisors of n.
 * @author Sean A. Irvine
 */
public class A066841 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod = prod.multiply(d.pow(mN / d.longValue()));
    }
    return prod;
  }
}
