package irvine.oeis.a111;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A111535 a(n) = A111534(n)/n = A111528(n,n)/n for n&gt;=1.
 * @author Georg Fischer
 */
public class A111535 extends AbstractSequence {

  private final A111534 mSeq1 = new A111534();
  private long mN;

  /** Construct the sequence. */
  public A111535() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}
