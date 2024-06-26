package irvine.oeis.a320;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002410;

/**
 * A320141 a(n) is the sum of the nearest integer to the imaginary part of the n-th zero of the Riemann zeta function and the n-th prime.
 * @author Georg Fischer
 */
public class A320141 extends AbstractSequence {

  private final A002410 mSeq1 = new A002410();
  private final A000040 mSeq2 = new A000040();

  /** Construct the sequence. */
  public A320141() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
