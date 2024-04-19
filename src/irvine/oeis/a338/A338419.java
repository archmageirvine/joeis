package irvine.oeis.a338;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013599;
import irvine.oeis.a013.A013605;

/**
 * A338419 (Smallest prime &gt;= 5^n) - (largest prime &lt;= 5^n).
 * @author Georg Fischer
 */
public class A338419 extends AbstractSequence {

  private int mN = 0;
  private final A013599 mSeq1 = new A013599();
  private final A013605 mSeq2 = new A013605();

  /** Construct the sequence. */
  public A338419() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().add(mSeq2.next());
    return (++mN == 1) ? Z.ZERO : result;
  }
}
