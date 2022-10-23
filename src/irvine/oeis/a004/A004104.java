package irvine.oeis.a004;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004104 Number of self-dual signed graphs with n nodes. Also number of self-complementary 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A004104 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex zn = SymmetricGroup.create(++mN).cycleIndex();
    final CycleIndex pair = zn.op(PairMultiply.OP, zn);
    return pair.eval(3, 1).toZ();
  }
}

