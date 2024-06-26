package irvine.oeis.a293;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A293801 Number of multisets of nonempty words with a total of n letters over senary alphabet containing the sixth letter such that within each prefix of a word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * @author Georg Fischer
 */
public class A293801 extends AbstractSequence {

  private final A293736 mSeq1 = new A293736();
  private final A293735 mSeq2 = new A293735();

  /** Construct the sequence. */
  public A293801() {
    super(6);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
