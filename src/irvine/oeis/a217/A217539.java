package irvine.oeis.a217;
// manually 2023-12-24/tuptraf at 2023-12-26 12:51

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a189.A189912;

/**
 * A217539 Number of Dyck paths of semilength n which satisfy the condition: number of returns + number of hills &lt; number of peaks.
 * a(n) = A000108(n) - A189912(n-1) for n &gt; 0.
 * @author Georg Fischer
 */
public class A217539 extends AbstractSequence {

  private int mN = -1;
  private final A000108 mSeq1 = new A000108();
  private final A189912 mSeq2 = new A189912();

  /** Construct the sequence. */
  public A217539() {
    super(0);
    mSeq1.skip(1);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 0) {
      return Z.ZERO;
    }
    return mSeq1.next().subtract(mSeq2.next());
  }
}
