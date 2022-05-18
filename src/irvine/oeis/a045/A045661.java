package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045661 a(n) = Product_{d|n} (n/d + d).
 * @author Sean A. Irvine
 */
public class A045661 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod = prod.multiply(d.add(mN / d.longValue()));
    }
    return prod;
  }
}
