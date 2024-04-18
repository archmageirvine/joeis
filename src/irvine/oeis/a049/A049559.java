package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000010;

/**
 * A049559 a(n) = gcd(n - 1, phi(n)).
 * @author Sean A. Irvine
 */
public class A049559 extends A000010 implements DirectSequence {

  @Override
  public Z a(final int n) {
    return Z.valueOf(Functions.PHI.l((long) n)).gcd(Z.valueOf(n - 1));
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).phi().gcd(n.subtract(1));
  }

  @Override
  public Z next() {
    return super.next().gcd(Z.valueOf(mN - 1));
  }
}

