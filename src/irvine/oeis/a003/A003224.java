package irvine.oeis.a003;

import irvine.math.group.DihedralGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.RedfieldExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003224 The number of superpositions of cycles of order n of the groups E_3 and D_n.
 * @author Sean A. Irvine
 */
public class A003224 implements Sequence {

  private static final CycleIndex E3 = new CycleIndex("E_3", MultivariateMonomial.create(1, 3));
  private int mN = 2;

  @Override
  public Z next() {
    return RedfieldExponentiation.count(DihedralGroup.cycleIndex(++mN), E3);
  }
}
