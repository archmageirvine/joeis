package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081576 Square array of binomial transforms of Fibonacci numbers, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A081576 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, m, k -> Binomial.binomial(m, k).multiply(Z.valueOf(n - m).pow(m - k)).multiply(Functions.FIBONACCI.z(k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
