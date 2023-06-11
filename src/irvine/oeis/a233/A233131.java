package irvine.oeis.a233;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004125;
import irvine.oeis.a024.A024934;

/**
 * A233131 Sum of remainders of n modulo all smaller composite numbers.
 * @author Georg Fischer
 */
public class A233131 extends AbstractSequence {

  private int mN = -1;
  private A004125 mSeq1 = new A004125();
  private A024934 mSeq2 = new A024934();

  /** Construct the sequence. */
  public A233131() {
    super(0);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}
