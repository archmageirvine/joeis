package irvine.oeis.a218;
// Generated by gen_seq4.pl anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A218571 Number of partitions p of n such that max(p)-min(p) = 8.
 * @author Georg Fischer
 */
public class A218571 extends AbstractSequence {

  private final A218510 mSeq1 = new A218510();
  private final A218509 mSeq2 = new A218509();

  /** Construct the sequence. */
  public A218571() {
    super(10);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
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
