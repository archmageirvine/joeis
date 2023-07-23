package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006928;

/**
 * A025506 Least k such that first k terms of A006928 contain n more 1's than 2's.
 * @author Sean A. Irvine
 */
public class A025506 extends AbstractSequence {

  private final A006928 mSeq1 = new A006928();

  /** Construct the sequence. */
  public A025506() {
    super(0);
  }

  private long mRunningDelta = 0;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    while (mRunningDelta != mN) {
      mRunningDelta -= mSeq1.next().longValue() * 2 - 3;
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
