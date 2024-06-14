package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000005;

/**
 * A049820 a(n) = n - d(n), where d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A049820 extends A000005 implements DirectSequence {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).subtract(t);
  }

  @Override
  public Z a(final Z n) {
    return n.subtract(Functions.SIGMA0.z(n));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).subtract(Functions.SIGMA0.z(n));
  }

}
