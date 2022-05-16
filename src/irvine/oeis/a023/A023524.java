package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A023524 Number of distinct prime divisors of prime(n)*prime(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A023524 extends A023523 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}
