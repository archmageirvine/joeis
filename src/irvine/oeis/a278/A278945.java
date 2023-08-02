package irvine.oeis.a278;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A278945 Expansion of Sum_{k&gt;=1} k*(2*k - 1)*x^k/(1 - x^k).
 * <code>a(n) = Sum_{d|n} d*(2*d - 1)</code>
 * @author Georg Fischer
 */
public class A278945 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z result = Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).multiply(2L * d - 1));
    return (mN == 0) ? Z.ZERO : result;
  }
}
