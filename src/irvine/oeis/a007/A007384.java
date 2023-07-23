package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001687;

/**
 * A007384 Number of strict 3rd-order maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007384 extends AbstractSequence {

  private final A001687 mSeq1 = new A001687();

  /** Construct the sequence. */
  public A007384() {
    super(1);
  }

  {
    for (int k = 0; k < 7; ++k) {
      next();
    }
  }

  private long mN = 1;
  private boolean mAlternate = true;

  @Override
  public Z next() {
    if (mAlternate) {
      ++mN;
    }
    mAlternate = !mAlternate;
    return mSeq1.next().subtract(mAlternate ? mN : 1);
  }
}
