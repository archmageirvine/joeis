package irvine.oeis.a194;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006128;
import irvine.oeis.a024.A024786;

/**
 * A194452 Total number of repeated parts in all partitions of n.
 * @author Georg Fischer
 */
public class A194452 extends AbstractSequence {

  private A006128 mSeq1 = new A006128();
  private A024786 mSeq2 = new A024786();

  /** Construct the sequence. */
  public A194452() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
