package irvine.oeis.a135;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002378;
import irvine.oeis.a007.A007504;

/**
 * A135267 Difference between partial sum of the first n primes and the first n even numbers greater than 0.
 * @author Georg Fischer
 */
public class A135267 extends AbstractSequence {

  private final A007504 mSeq1 = new A007504();
  private final A002378 mSeq2 = new A002378();

  /** Construct the sequence. */
  public A135267() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
