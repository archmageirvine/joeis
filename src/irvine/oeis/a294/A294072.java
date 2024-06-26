package irvine.oeis.a294;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a048.A048785;

/**
 * A294072 Number of noncube divisors of n^3.
 * @author Georg Fischer
 */
public class A294072 extends AbstractSequence {

  private final A048785 mSeq1 = new A048785();
  private final A000005 mSeq2 = new A000005();

  /** Construct the sequence. */
  public A294072() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
