package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A046803 Triangle of numbers related to Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A046803 extends A008292 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(get(mN - k, mM)));
    }
    return sum.max(Z.ONE);
  }
}
