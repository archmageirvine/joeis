package irvine.oeis.a178;
// Generated by gen_seq4.pl dersimple at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a144.A144448;

/**
 * A178978 a(n) = A144448(n+1)/8.
 * @author Georg Fischer
 */
public class A178978 extends AbstractSequence {

  private final A144448 mSeq1 = new A144448();

  /** Construct the sequence. */
  public A178978() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(8);
  }
}
