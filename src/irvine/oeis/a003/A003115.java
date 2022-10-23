package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003115 a(0) = a(1) = 1; for n &gt;= 2, a(n)=a(n-1)*4^[n/2]-a(n-2).
 * @author Sean A. Irvine
 */
public class A003115 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.shiftLeft(mN & ~1).subtract(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

