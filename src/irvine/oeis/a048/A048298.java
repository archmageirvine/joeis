package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A048298 a(n) = n if n=2^i for i &gt;= 0, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A048298 extends Sequence0 implements DirectSequence {

  private long mN = -1;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 2;
      return Z.valueOf(mN);
    }
    return Z.ZERO;
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : (n.equals(Z.ONE.shiftLeft(n.bitLength() - 1)) ? n : Z.ZERO);
  }

  @Override
  public Z a(final int n) {
    return Integer.highestOneBit(n) == n ? Z.valueOf(n) : Z.ZERO;
  }

}
