package irvine.oeis.a243;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002370;

/**
 * A243107.
 * @author Sean A. Irvine
 */
public class A243107 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final A002370 skew = new A002370();
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; k += 2) {
      s = s.add(Binomial.binomial(mN, mN - k).multiply(skew.next()));
    }
    return s;
  }
}
