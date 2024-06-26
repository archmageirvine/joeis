package irvine.oeis.a351;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005382;
import irvine.oeis.a005.A005383;

/**
 * A351875 Positive difference of the distinct prime factors of A129521(n).
 * @author Georg Fischer
 */
public class A351875 extends AbstractSequence {

  private final A005383 mSeq1 = new A005383();
  private final A005382 mSeq2 = new A005382();

  /** Construct the sequence. */
  public A351875() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
