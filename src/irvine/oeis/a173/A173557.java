package irvine.oeis.a173;
// manually 2025-08-22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003557;

/**
 * A173557 a(n) = Product_{primes p dividing n} (p-1).
 * @author Georg Fischer
 */
public class A173557 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA003557 = new A003557();
  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PHI.z(n).divide(mA003557.a(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.PHI.z(n).divide(mA003557.a(n));
  }

}
