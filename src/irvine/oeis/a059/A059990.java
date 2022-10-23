package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059990 Number of points of period n under the dual of the map x-&gt;2x on Z[1/6].
 * @author Sean A. Irvine
 */
public class A059990 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    Z t = mA.subtract(1);
    while (t.mod(3) == 0) {
      t = t.divide(3);
    }
    return t;
  }
}
