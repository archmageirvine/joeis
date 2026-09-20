package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;

/**
 * A001248 Squares of primes.
 * @author Sean A. Irvine
 */
public class A001248 extends A000040 implements DirectSequence {

  @Override
  public Z next() {
    return super.next().square();
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME.z(n).square();
  }

  @Override
  public Z a(final long n) {
    return Functions.PRIME.z(n).square();
  }

}
