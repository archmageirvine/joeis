package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;

/**
 * A065091 Odd primes.
 * @author Georg Fischer
 */
public class A065091 extends A000040 implements DirectSequence {

  {
    super.next();
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME.z(n.add(1));
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME.z(n + 1);
  }

}
