package irvine.oeis.a279;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a001.A001159;

/**
 * A279363 Sum of 4th powers of proper divisors of n.
 * @author Georg Fischer
 */
public class A279363 extends AbstractSequence {

  private final A001159 mSeq1 = new A001159();
  private final A000583 mSeq2 = new A000583();

  /** Construct the sequence. */
  public A279363() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
