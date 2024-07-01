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

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final Z n1 = n.subtract(1);
    return n1.isZero() ? Z.ZERO : Functions.DIGIT_LENGTH.z(2, n1);
  }

  @Override
  public Z a(final int n) {
    final int n1 = n - 1;
    return n1 <= 0 ? Z.ZERO : Functions.DIGIT_LENGTH.z(2, n1);
  }

}
