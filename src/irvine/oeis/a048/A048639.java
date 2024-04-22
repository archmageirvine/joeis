package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006881;

/**
 * A048639 Binary encoding of A006881, numbers with two distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A048639 extends A006881 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return Z.ONE.shiftLeft(Functions.PRIME_PI.l(p[1]) - 1)
      .or(Z.ONE.shiftLeft(Functions.PRIME_PI.l(p[0]) - 1));
  }
}

