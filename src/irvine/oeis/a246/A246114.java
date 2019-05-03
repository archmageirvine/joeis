package irvine.oeis.a246;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A246114 Number of inequivalent <code>n X n</code> matrices with entries from <code>[8]</code>, where equivalence means permutations of rows or columns.
 * @author Sean A. Irvine
 */
public class A246114 implements Sequence {

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
