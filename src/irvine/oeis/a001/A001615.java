package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001615 Dedekind psi function: n * Product_{p|n, p prime} (1 + 1/p).
 * @author Sean A. Irvine
 */
public class A001615 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.DEDEKIND_PSI.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.DEDEKIND_PSI.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.DEDEKIND_PSI.z(n);
  }
}
