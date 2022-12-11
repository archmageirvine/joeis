package irvine.oeis.a103;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a006.A006125;

/**
 * A103904 a(n) = n*(n-1)/2 * 2^(n*(n-1)/2).
 * @author Georg Fischer
 */
public class A103904 extends AbstractSequence {

  private final A000217 mSeq1 = new A000217();
  private final A006125 mSeq2 = new A006125();

  /** Construct the sequence. */
  public A103904() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
