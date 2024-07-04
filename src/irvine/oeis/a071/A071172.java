package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071172 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    return Integers.SINGLETON.sum(1, Functions.SQRT.i(mT) + 1, k -> mT.divide((long) k * k).multiply(Functions.MOBIUS.z(k)));
  }
}
