package irvine.oeis.a338;
// manually anopan 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013598;
import irvine.oeis.a013.A013604;

/**
 * A338155 (Smallest prime &gt;= 3^n) - (largest prime &lt;= 3^n).
 * @author Georg Fischer
 */
public class A338155 extends AbstractSequence {

  private int mN = 0;
  private A013598 mSeq1 = new A013598();
  private A013604 mSeq2 = new A013604();

  /** Construct the sequence. */
  public A338155() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
