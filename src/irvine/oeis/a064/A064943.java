package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A064943 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(100);
    return Jaguar.factor(mA.add(1)).sigma0().subtract(2);
  }
}
