package irvine.oeis.a278;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A278947 Expansion of Sum_{k>=1} (k*(5*k - 3)/2)*x^k/(1 - x^k).
 * <code>a(n) = Sum_{d|n} d*(5*d - 3)/2</code>
 * @author Georg Fischer
 */
public class A278947 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z result = Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).multiply(5 * d - 3).divide2());
    return (mN == 0) ? Z.ZERO : result;
  }
}
