package irvine.oeis.a115;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A115973 Number of distinct prime factors of p^p + 1 where p is prime(n).
 * @author Sean A. Irvine
 */
public class A115973 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.valueOf(Jaguar.factor(p.pow(p).add(1)).omega());
  }
}
