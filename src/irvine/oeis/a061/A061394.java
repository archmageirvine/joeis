package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A061394 Number of distinct prime factors of n-th least prime signature (A025487); also a(n)-th prime is largest prime factor of n-th least prime signature; also a(n)-th primorial number is largest primorial factor of n-th least product of primorial numbers.
 * @author Sean A. Irvine
 */
public class A061394 extends A025487 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}

