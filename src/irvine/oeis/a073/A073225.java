package irvine.oeis.a073;
// manually anopsn 0,1

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001142;

/**
 * A073225 a(n) = ceiling(n^n/n!).
 * @author Georg Fischer
 */
public class A073225 extends AbstractSequence {

  private int mN = -1;
  private final A001142 mSeq1 = new A001142();
  private Z mA;

  /** Construct the sequence. */
  public A073225() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Q result = new Q(b, mA);
    mA = b;
    return result.ceiling();
  }
}
