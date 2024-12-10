package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073581 Factorials successively exponentiated.
 * @author Sean A. Irvine
 */
public class A073581 extends Sequence0 {

  private Z mA = null;
  private int mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.FACTORIAL.z(++mN).pow(mA);
    return mA;
  }
}
