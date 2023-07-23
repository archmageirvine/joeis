package irvine.oeis.a227;
// manually valuation/valuat at 2022-03-16 18:05

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005132;

/**
 * A227838 2^a(n) is the highest power of 2 dividing A005132(n).
 * @author Georg Fischer
 */
public class A227838 extends AbstractSequence {

  private final A005132 mSeq1 = new A005132();

  /** Construct the sequence. */
  public A227838() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(mSeq1.next(), Z.TWO));
  }
}
