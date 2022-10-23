package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006040 a(n) = Sum_{i=0..n} (n!/(n-i)!)^2.
 * @author Sean A. Irvine
 */
public class A006040 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(mN).add(1);
    }
    return mA;
  }
}

