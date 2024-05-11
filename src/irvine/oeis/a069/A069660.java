package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A069055.
 * @author Sean A. Irvine
 */
public class A069660 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return (++mN & 1) == 1 ? Functions.FACTORIAL.z(mN) : Functions.FACTORIAL.z(mN / 2).square().multiply2();
  }
}
