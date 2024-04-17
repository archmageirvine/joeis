package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001414 Integer log of n: sum of primes dividing n (with repetition). Also called sopfr(n).
 * @author Sean A. Irvine
 */
public class A001414 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    return Functions.SOPFR.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return Functions.SOPFR.z(++mN);
  }
}
