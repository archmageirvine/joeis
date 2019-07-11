package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024429 Expansion of e.g.f. <code>sinh(exp(x)-1)</code>.
 * @author Sean A. Irvine
 */
public class A024429 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Stirling.secondKind(mN, 2 * k + 1));
    }
    return sum;
  }
}
