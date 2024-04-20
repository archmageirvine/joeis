package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a031.A031930;

/**
 * A052258 Last filtering prime (A052180) of primes p such that next prime is p+12.
 * @author Sean A. Irvine
 */
public class A052258 extends A031930 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    Z s = p.add(1);
    Z max = Z.ONE;
    while (!s.equals(q)) {
      max = max.max(Functions.LPF.z(s));
      s = s.add(1);
    }
    return max;
  }
}
