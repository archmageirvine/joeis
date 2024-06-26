package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A069660 Order of the subgroup of the symmetric group S_n generated by the cycles (1,3) and (1,2,3,...,n).
 * @author Sean A. Irvine
 */
public class A069660 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return (++mN & 1) == 1 ? Functions.FACTORIAL.z(mN) : Functions.FACTORIAL.z(mN / 2).square().multiply2();
  }
}
