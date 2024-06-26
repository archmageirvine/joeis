package irvine.oeis.a218;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.a001.A001006;

/**
 * A218264 Number of standard Young tableaux of n cells and height &gt;= 4.
 * @author Georg Fischer
 */
public class A218264 extends AbstractSequence {

  private final A000085 mSeq1 = new A000085();
  private final A001006 mSeq2 = new A001006();

  /** Construct the sequence. */
  public A218264() {
    super(4);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
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
