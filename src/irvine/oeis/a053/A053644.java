package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A053644 Most significant bit of n, msb(n); largest power of 2 less than or equal to n; write n in binary and change all but the first digit to zero.
 * @author Georg Fischer
 */
public class A053644 extends Sequence0 implements DirectSequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : Z.ONE.shiftLeft(n.bitLength() - 1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Integer.highestOneBit(n));
  }

}
