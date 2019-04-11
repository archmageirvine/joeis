package irvine.oeis.a002;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002725 Number of incidence matrices: n X <code>(n+1)</code> binary matrices under row and column permutations.
 * @author Sean A. Irvine
 */
public class A002725 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
    return ci.op(HararyMultiply.OP, SymmetricGroup.create(mN + 1).cycleIndex()).apply(1).toZ();
  }
}
