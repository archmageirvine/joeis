package irvine.oeis.a191;

import irvine.math.group.DihedralGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A191563 For n &gt;= 3, draw a regular n-sided polygon and its n(n-3)/2 diagonals, so there are n(n-1)/2 lines; a(n) is the number of ways to choose a subset of these lines (subsets differing by a rotation or reflection are regarded as identical). a(1)=1, a(2)=2 by convention.
 * @author Sean A. Irvine
 */
public class A191563 extends Sequence1 {

  private final CycleIndex mS3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CycleIndex d = DihedralGroup.cycleIndex(mN);
    final CycleIndex c = d.op(PairMultiply.OP, mS3);
    return c.eval(2).toZ();
  }
}
