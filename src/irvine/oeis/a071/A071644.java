package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005148;

/**
 * A071644 a(n) = A005148(2^n-1)/8^(n-1).
 * @author Sean A. Irvine
 */
public class A071644 extends Sequence1 {

  private final Sequence mSeq = new A005148();
  private long mM = -1;
  private int mN = 0;

  @Override
  public Z next() {
    Z t = Z.ZERO;
    final long lim = (1L << ++mN) - 1;
    while (mM < lim) {
      t = mSeq.next();
      ++mM;
    }
    // Test assumption of this sequence
    final int shift = 3 * (mN - 1);
    for (int k = 0; k < shift; ++k) {
      if (t.testBit(k)) {
        throw new RuntimeException("Assumption of sequence is wrong for n=" + mN);
      }
    }
    return t.shiftRight(shift);
  }
}
