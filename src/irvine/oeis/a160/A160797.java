package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A160797 First differences of A160796.
 * @author Sean A. Irvine
 */
public class A160797 extends AbstractSequence {

  private final A160796 mSeq1 = new A160796();

  /** Construct the sequence. */
  public A160797() {
    super(1);
  }

  private Z mPrev = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mSeq1.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

