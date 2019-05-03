package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000667 Boustrophedon transform of <code>all-1</code>'s sequence.
 * @author Sean A. Irvine
 */
public class A000667 implements Sequence {

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
