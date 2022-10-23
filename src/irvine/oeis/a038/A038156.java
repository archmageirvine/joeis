package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038156 a(n) = n! * Sum_{k=1..n-1} 1/k!.
 * @author Sean A. Irvine
 */
public class A038156 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.add(1).multiply(mN);
    }
    return mA;
  }
}
