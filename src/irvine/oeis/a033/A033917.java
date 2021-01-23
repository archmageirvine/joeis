package irvine.oeis.a033;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033917 Coefficients of iterated exponential function defined by y(x) = x^y(x) for e^-e &lt; x &lt; e^(1/e), expanded about x=1.
 * @author Sean A. Irvine
 */
public class A033917 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}
