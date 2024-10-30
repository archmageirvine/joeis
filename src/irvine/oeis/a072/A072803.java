package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072803.
 * @author Sean A. Irvine
 */
public class A072803 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final int r = (int) mN.mod(10);
    return r == 0 ? Z.ZERO : new Z(mN.toString(r));
  }
}
