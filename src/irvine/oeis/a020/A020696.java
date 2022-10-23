package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020696 Let a,b,c,...k be all divisors of n; a(n) = (a+1)*(b+1)*...*(k+1).
 * @author Sean A. Irvine
 */
public class A020696 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod = prod.multiply(d.add(1));
    }
    return prod;
  }
}
