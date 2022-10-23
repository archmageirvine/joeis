package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038157 a(n) = n! * Sum_{k=1..n-2} 1/k!.
 * @author Sean A. Irvine
 */
public class A038157 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.subtract(mN).multiply(mN + 1);
    }
    return mA.abs();
  }
}
