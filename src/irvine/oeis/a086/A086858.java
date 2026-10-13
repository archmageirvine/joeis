package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086858 Let f(n) be the inverse of the function g(x) = x^x. Then a(n) = floor(f(n)).
 * @author Sean A. Irvine
 */
public class A086858 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    return new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(x).subtract(mN);
      }
    }.inverseMonotone(CR.ONE, CR.valueOf(mN)).execute(CR.ZERO).floor();
  }
}
