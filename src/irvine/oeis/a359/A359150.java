package irvine.oeis.a359;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a066.A066829;
import irvine.oeis.a121.A121262;

/**
 * A359150 a(n) = 1 if n is a number of the form 4u+1 with an odd number of prime factors (counted with multiplicity), otherwise 0.
 * @author Georg Fischer
 */
public class A359150 extends AbstractSequence {

  private final A066829 mSeq1 = new A066829();
  private final A121262 mSeq2 = new A121262();

  /** Construct the sequence. */
  public A359150() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
