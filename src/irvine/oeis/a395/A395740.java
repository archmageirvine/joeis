package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395740 Number of iterations for the n-th prime to reach 2 under the function f(p) = smallest odd prime factor of 3*p+1 or 2 if 3*p+1 is a power of 2.
 * @author Sean A. Irvine
 */
public class A395740 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (!Predicates.POWER_OF_TWO.is(p)) {
      p = Functions.LPF.z(p.multiply(3).add(1).makeOdd());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
