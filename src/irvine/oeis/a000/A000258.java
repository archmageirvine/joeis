package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000258 Expansion of e.g.f. exp(exp(exp(x)-1)-1).
 * @author Sean A. Irvine
 */
public class A000258 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k).multiply(Functions.BELL.z(k)));
    }
    return sum;
  }
}

