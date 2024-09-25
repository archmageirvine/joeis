package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072346 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Functions.FACTORIAL.z(mN / 2) : Functions.MULTIFACTORIAL.z(mN);
  }
}
