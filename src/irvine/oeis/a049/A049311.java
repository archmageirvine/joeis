package irvine.oeis.a049;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049311 Number of (0,1) matrices with n ones and no zero rows or columns, up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A049311 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex sn = SymmetricGroup.create(++mN).cycleIndex();
    return sn.op(HararyMultiply.OP, sn).applyOnePlusXToTheN(mN).coeff(mN).toZ();
  }
}
