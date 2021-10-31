package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a031.A031928;

/**
 * A052257 Last filtering prime (A052180) of primes p such that next prime is p+10.
 * @author Sean A. Irvine
 */
public class A052257 extends A031928 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    Z s = p.add(1);
    Z max = Z.ONE;
    while (!s.equals(q)) {
      max = max.max(Cheetah.factor(s).toZArray()[0]);
      s = s.add(1);
    }
    return max;
  }
}
