package irvine.oeis.a073;
// manually anopan

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002884;
import irvine.oeis.a006.A006951;

/**
 * A073960 Number of commuting elements: number of ordered pairs g, h in the group GL(n, 2) such that gh = hg.
 * @author Georg Fischer
 */
public class A073960 extends Sequence1 {

  private A002884 mSeq1 = new A002884();
  private A006951 mSeq2 = new A006951();

  /** Construct the sequence. */
  public A073960() {
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
