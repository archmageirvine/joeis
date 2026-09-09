package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002012 Almost trivalent maps.
 * @author Sean A. Irvine
 */
public class A002012 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2 * (mN + 1)).divide(Functions.FACTORIAL.z(mN + 1)).multiply(mN + 3).multiply2().divide(Functions.FACTORIAL.z(mN)).divide(3);
  }
}

