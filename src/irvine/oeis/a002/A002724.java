package irvine.oeis.a002;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002724 Number of inequivalent n X n binary matrices, where equivalence means permutations of rows or columns.
 * @author Sean A. Irvine
 */
public class A002724 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final CycleIndex zn = SymmetricGroup.create(mN).cycleIndex();
    return zn.op(HararyMultiply.OP, zn).apply(1).toZ();
  }
}
