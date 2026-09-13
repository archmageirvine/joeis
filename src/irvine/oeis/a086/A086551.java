package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086551 a(n) = smallest k such that tau(k)= n*tau(k-1) where tau(k) = number of divisors of k, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086551 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.ZERO;
    while (true) {
      final Z u = t;
      t = Functions.SIGMA0.z(++k);
      if (u.multiply(mN).equals(t)) {
        return Z.valueOf(k);
      }
    }
  }
}
