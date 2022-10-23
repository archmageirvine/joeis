package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A058042 Trajectory of binary number 10110 under the operation 'Reverse and Add!' carried out in base 2.
 * @author Sean A. Irvine
 */
public class A058042 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.add(ZUtils.reverse(mA, 2));
    return new Z(mA.toString(2));
  }
}
