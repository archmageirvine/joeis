package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A056187 Least prime factor of n^n + (n+1)^(n+1).
 * @author Sean A. Irvine
 */
public class A056187 extends A056788 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).leastPrimeFactor();
  }
}
