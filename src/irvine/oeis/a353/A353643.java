package irvine.oeis.a353;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000010;

/**
 * A353643 The greatest common divisor of phi(n) and phi(sigma(n)).
 * @author Georg Fischer
 */
public class A353643 extends AbstractSequence {

  private final A000010 mSeq1 = new A000010();
  private final A353644 mSeq2 = new A353644();

  /** Construct the sequence. */
  public A353643() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
