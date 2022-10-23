package irvine.oeis.a053;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053391 Number of cycle types of direct products of two degree-n permutations.
 * @author Sean A. Irvine
 */
public class A053391 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex zn = SymmetricGroup.create(mN).cycleIndex();
    return Z.valueOf(zn.op(HararyMultiply.OP, zn).size());
  }
}
