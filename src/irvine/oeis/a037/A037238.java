package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037238 5x - 1 sequence starting at 19 (a(n+1) = a(n)/2 if a(n) is even, or 5*a(n)-1 if a(n) is odd).
 * @author Sean A. Irvine
 */
public class A037238 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : (mA.isEven() ? mA.divide2() : mA.multiply(5).subtract(1));
    return mA;
  }
}
