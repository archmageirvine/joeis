package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000277 3*n - 2*floor(sqrt(4*n+5)) + 5.
 * @author Sean A. Irvine
 */
public class A000277 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(5).subtract(mN.shiftLeft(2).add(5).sqrt().multiply2());
  }
}
