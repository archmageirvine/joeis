package irvine.oeis.a246;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A246114 Number of inequivalent n X n matrices with entries from [8], where equivalence means permutations of rows or columns.
 * @author Sean A. Irvine
 */
public class A246114 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
    return ci.op(HararyMultiply.OP, ci).apply(3).toZ();
  }
}
