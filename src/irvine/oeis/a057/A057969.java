package irvine.oeis.a057;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057969 5 x n binary matrices without unit columns up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A057969 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex zn = SymmetricGroup.create(mN).cycleIndex();
    final Q q1 = zn.eval(27);
    final Q q2 = zn.eval(27, 13).multiply(10);
    final Q q3 = zn.eval(27, 7).multiply(15);
    final Q q4 = zn.eval(27, 6, 6).multiply(20);
    final Q q5 = zn.eval(27, 4, 6, 13, 6, 4).multiply(20);
    final Q q6 = zn.eval(27, 3, 7, 3).multiply(30);
    final Q q7 = zn.eval(27, 2, 2, 2, 2).multiply(24);
    return q1.add(q2).add(q3).add(q4).add(q5).add(q6).add(q7).divide(120).toZ();
  }
}
