package irvine.oeis.a071;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A071697 Product of twin primes of form (4*k+1,4*k+3), k&gt;0.
 * @author Georg Fischer
 */
public class A071697 extends AbstractSequence {

  private final A071695 mSeq1 = new A071695();
  private final A071696 mSeq2 = new A071696();

  /** Construct the sequence. */
  public A071697() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
