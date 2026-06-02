package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085102 Go on adding the divisors of n starting from n in decreasing order until one gets a prime. a(n) = this prime, or 0 if no prime is obtained.
 * @author Sean A. Irvine
 */
public class A085102 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    Z sum = Z.ZERO;
    for (int k = d.length - 1; k >= 0; --k) {
      sum = sum.add(d[k]);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
    return Z.ZERO;
  }
}

