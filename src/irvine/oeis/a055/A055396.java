package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055396 Smallest prime dividing n is a(n)-th prime (a(1)=0).
 * @author Sean A. Irvine
 */
public class A055396 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Functions.PRIME_PI.z(Functions.LPF.z(mN));
  }

  @Override
  public Z a(final Z n) {
    return n.equals(Z.ONE) ? Z.ZERO : Functions.PRIME_PI.z(Functions.LPF.z(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
