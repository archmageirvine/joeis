package irvine.oeis.a052;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052271.
 * @author Sean A. Irvine
 */
public class A052271 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
    return ci.op(HararyMultiply.OP, ci).apply(2).toZ();
  }
}
