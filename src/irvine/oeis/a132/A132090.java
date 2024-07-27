package irvine.oeis.a132;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A132090 a(n) = pi(pi(n)), where pi = A000720.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A132090 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return Functions.PRIME_PI.z(Functions.PRIME_PI.z(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
