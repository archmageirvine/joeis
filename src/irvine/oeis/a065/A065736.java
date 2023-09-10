package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065736 Largest square &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A065736 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return mA.sqrt().square();
  }
}
