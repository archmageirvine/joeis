package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000248;

/**
 * A005727 n-th derivative of <code>x^x</code> at <code>x=1</code>. Also called Lehmer-Comtet numbers.
 * @author Sean A. Irvine
 */
public class A005727 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence mA = new A000248();
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).multiply(mA.next()));
    }
    return sum;
  }
}

