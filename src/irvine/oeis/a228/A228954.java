package irvine.oeis.a228;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000367;
import irvine.oeis.a001.A001897;

/**
 * A228954 Bisection of A195240(n).
 * @author Georg Fischer
 */
public class A228954 extends AbstractSequence {

  private int mN = -1;
  private final A000367 mSeq1 = new A000367();
  private final A001897 mSeq2 = new A001897();

  /** Construct the sequence. */
  public A228954() {
    super(0);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return mSeq1.next().add(mSeq2.next()).divide2();
  }
}
