package irvine.oeis.a114;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001523;
import irvine.oeis.a006.A006330;

/**
 * A114921 Number of unimodal compositions of n+2 where the maximal part appears exactly twice.
 * @author Georg Fischer
 */
public class A114921 extends AbstractSequence {

  private int mN = -1;
  private final A006330 mSeq1 = new A006330();
  private final A001523 mSeq2 = new A001523();

  /** Construct the sequence. */
  public A114921() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ONE : result;
  }
}
