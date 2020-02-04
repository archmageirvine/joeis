package irvine.oeis.a000;

import irvine.math.z.BellNumbers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000258 Expansion of e.g.f. <code>exp(exp(exp(x)-1)-1)</code>.
 * @author Sean A. Irvine
 */
public class A000258 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(BellNumbers.bell(k)));
    }
    return sum;
  }
}

