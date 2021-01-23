package irvine.oeis.a014;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014304 Expansion of e.g.f. 1/sqrt(exp(x)*(2-exp(x))).
 * @author Sean A. Irvine
 */
public class A014304 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN / 2; ++k) {
      if (k > 0) {
        f = f.multiply(2L * k).multiply(2L * k - 1).divide(k);
      }
      sum = sum.add(f.square().multiply(Stirling.secondKind(mN, 2L * k)).shiftRight(2 * k));
    }
    return sum;
  }
}

