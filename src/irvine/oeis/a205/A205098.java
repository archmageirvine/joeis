package irvine.oeis.a205;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005101;
import irvine.oeis.a204.A204822;

/**
 * A205098 Sum of proper divisors (A001065) of abundant numbers (A005101).
 * @author Georg Fischer
 */
public class A205098 extends AbstractSequence {

  private final A204822 mSeq1 = new A204822();
  private final A005101 mSeq2 = new A005101();

  /** Construct the sequence. */
  public A205098() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
