package irvine.oeis.a002;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002728 Number of n X (n+2) binary matrices.
 * @author Sean A. Irvine
 */
public class A002728 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
    return ci.op(HararyMultiply.OP, SymmetricGroup.create(mN + 2).cycleIndex()).apply(1).toZ();
  }
}
