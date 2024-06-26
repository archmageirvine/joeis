package irvine.oeis.a271;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a034.A034386;

/**
 * A271387 Numerator of prime(n)#/n!, where prime(n)# is the prime factorial function.
 * @author Georg Fischer
 */
public class A271387 extends AbstractSequence {

  private final A002110 mSeq1 = new A002110();
  private final A034386 mSeq2 = new A034386();

  /** Construct the sequence. */
  public A271387() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
