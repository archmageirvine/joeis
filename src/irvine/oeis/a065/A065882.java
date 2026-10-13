package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A065882 Ultimate modulo 4: right-hand nonzero digit of n when written in base 4.
 * @author Sean A. Irvine
 */
public class A065882 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    while (m.and(Z.THREE).isZero()) {
      m = m.shiftRight(2);
    }
    return m.and(Z.THREE);
  }

  @Override
  public Z a(final long n) {
    long m = n;
    while ((m & 3) == 0) {
      m >>>= 2;
    }
    return Z.valueOf(m & 3);
  }

}
