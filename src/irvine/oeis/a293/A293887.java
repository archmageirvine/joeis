package irvine.oeis.a293;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A293887 Number of sets of nonempty words with a total of n letters over senary alphabet containing the sixth letter such that within each prefix of a word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * @author Georg Fischer
 */
public class A293887 extends AbstractSequence {

  private final A293745 mSeq1 = new A293745();
  private final A293744 mSeq2 = new A293744();

  /** Construct the sequence. */
  public A293887() {
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
