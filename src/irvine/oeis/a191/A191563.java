package irvine.oeis.a191;

import irvine.math.group.DihedralGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A191563.
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
