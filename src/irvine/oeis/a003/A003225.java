package irvine.oeis.a003;

import irvine.math.group.DihedralGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.RedfieldExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003225 The number of superpositions of cycles of order n of the groups <code>S_3</code> and <code>D_n</code>.
 * @author Sean A. Irvine
 */
public class A003225 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 2;

  @Override
  public Z next() {
    return RedfieldExponentiation.count(DihedralGroup.cycleIndex(++mN), Z3);
  }
}
