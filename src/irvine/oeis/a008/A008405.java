package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003725;

/**
 * A008405 n-th derivative of x^(1/x) at x=1.
 * @author Sean A. Irvine
 */
public class A008405 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final A003725 t = new A003725();
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).multiply(t.next()));
    }
    return sum;
  }
}


