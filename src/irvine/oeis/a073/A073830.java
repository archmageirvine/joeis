package irvine.oeis.a073;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005563;

/**
 * A073830 a(n) = 4*((n-1)! + 1) + n (mod n*(n + 2)).
 * @author Georg Fischer
 */
public class A073830 extends AbstractSequence {

  private final A073829 mSeq1 = new A073829();
  private final A005563 mSeq2 = new A005563();

  /** Construct the sequence. */
  public A073830() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}
