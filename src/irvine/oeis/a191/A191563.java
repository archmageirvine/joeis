package irvine.oeis.a191;

import irvine.math.group.DihedralGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A191563 For <code>n &gt;= 3,</code> draw a regular n-sided polygon and its <code>n(n-3)/2</code> diagonals, so there are <code>n(n-1)/2</code> lines; <code>a(n)</code> is the number of ways to choose a subset of these lines (subsets differing by a rotation or reflection are regarded as identical). <code>a(1)=1, a(2)=2</code> by convention.
 * @author Sean A. Irvine
 */
public class A191563 implements Sequence {

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
