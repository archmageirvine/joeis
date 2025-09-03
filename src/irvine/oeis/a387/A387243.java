package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387243 a(n) is the smallest positive k such that (k+n)^k &lt; (k+1)^(k+1).
 * @author Sean A. Irvine
 */
public class A387243 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    if (mN == 3) {
      return Z.TWO;
    }
    final UnaryCrFunction f = new UnaryCrFunction() {
      @Override
      public CR execute(final CR k) {
        final CR k1 = k.add(1);
        return k1.pow(k1.divide(k)).subtract(k).subtract(mN);
      }
    }.inverseMonotone(CR.valueOf(mA), CR.valueOf(mA.multiply(100)));
    mA = f.execute(CR.ZERO).ceil();
    return mA;
  }
}

