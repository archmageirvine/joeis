package irvine.oeis.a355;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a007.A007504;

/**
 * A355590 a(n) = (product of the first n primes) - (sum of the first n primes).
 * @author Georg Fischer
 */
public class A355590 extends AbstractSequence {

  private final A002110 mSeq1 = new A002110();
  private final A007504 mSeq2 = new A007504();

  /** Construct the sequence. */
  public A355590() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
