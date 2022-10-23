package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A002746 Sum of logarithmic numbers.
 * @author Sean A. Irvine
 */
public class A002746 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z kf = Z.ONE;
    final A000005 seq = new A000005();
    for (long k = 1; k <= mN; ++k) {
      s = s.add(seq.next().multiply(kf).multiply(Binomial.binomial(mN, k)));
      kf = kf.multiply(k);
    }
    return s;
  }
}
