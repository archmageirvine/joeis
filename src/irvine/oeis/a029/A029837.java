package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A029837 Binary order of n: log_2(n) rounded up to next integer.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A029837 extends Sequence1 implements DirectSequence {

  private long mN = 0L;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.CEILING_LOG2.z(n);
  }

  @Override
  public Z a(final long n) {
    return Functions.CEILING_LOG2.z(n);
  }
}
