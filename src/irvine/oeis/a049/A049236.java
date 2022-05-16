package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049236 a(n) is the number of distinct prime factors of prime(n) + 2.
 * @author Sean A. Irvine
 */
public class A049236 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next().add(2)).omega());
  }
}
