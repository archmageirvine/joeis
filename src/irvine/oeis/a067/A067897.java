package irvine.oeis.a067;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.a245.A245176;

/**
 * A067897 a(n) = A000085(n) - (1 + Sum_{j=1..n-1} A000085(j)).
 * @author Georg Fischer
 */
public class A067897 extends AbstractSequence {

  private int mN = -1;
  private final A000085 mSeq1 = new A000085();
  private final A245176 mSeq2 = new A245176();

  /** Construct the sequence. */
  public A067897() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 0) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}
