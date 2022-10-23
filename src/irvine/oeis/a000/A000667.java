package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000667 Boustrophedon transform of all-1's sequence.
 * @author Sean A. Irvine
 */
public class A000667 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final A000111 mS = new A000111();
    for (long k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, mN - k).multiply(mS.next()));
    }
    return s;
  }
}
