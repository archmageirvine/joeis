package irvine.oeis.a332;
// manually andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036903;

/**
 * A332262 Maximum position to start a search within the decimal digits of Pi in order to find all numeric strings with length n.
 * @author Georg Fischer
 */
public class A332262 extends AbstractSequence {

  private final A036903 mSeq1 = new A036903();
  private int mN;

  /** Construct the sequence. */
  public A332262() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mN - 1);
  }
}
