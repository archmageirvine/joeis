package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001221 Number of distinct primes dividing n (also called omega(n)).
 * @author Sean A. Irvine
 */
public class A001221 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    return Functions.OMEGA.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return Functions.OMEGA.z(++mN);
  }
}
