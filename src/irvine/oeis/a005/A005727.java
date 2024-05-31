package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000248;

/**
 * A005727 n-th derivative of x^x at x=1. Also called Lehmer-Comtet numbers.
 * @author Sean A. Irvine
 */
public class A005727 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence mA = new A000248();
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).multiply(mA.next()));
    }
    return sum;
  }
}

