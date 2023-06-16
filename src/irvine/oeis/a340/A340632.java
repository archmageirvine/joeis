package irvine.oeis.a340;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a062.A062383;
import irvine.oeis.a006.A006519;

/**
 * A340632 a(n) in binary is a run of 1-bits from the most significant 1-bit of n down to the least significant 1-bit of n, inclusive.
 * @author Georg Fischer
 */
public class A340632 extends AbstractSequence {

  private int mN = -1;
  private A062383 mSeq1 = new A062383();
  private A006519 mSeq2 = new A006519();

  /** Construct the sequence. */
  public A340632() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A062383(n) - A006519(n) for n>=1.
    return (++mN == 0) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}
