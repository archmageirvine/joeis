package irvine.oeis.a275;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a088.A088982;

/**
 * A275991 a(n) = prime(composite(n)) - prime(n).
 * @author Georg Fischer
 */
public class A275991 extends AbstractSequence {

  private final A088982 mSeq1 = new A088982();
  private final A000040 mSeq2 = new A000040();

  /** Construct the sequence. */
  public A275991() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
