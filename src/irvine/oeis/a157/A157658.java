package irvine.oeis.a157;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A157658 a(1) = 0, a(n) = -mu(n) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A157658 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : Z.valueOf(-Functions.MOBIUS.i((long) mN));
  }
}
