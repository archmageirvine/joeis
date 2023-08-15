package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027357;
import irvine.oeis.a027.A027358;

/**
 * A053250 Coefficients of the '3rd-order' mock theta function phi(q).
 * @author Sean A. Irvine
 */
public class A053250 extends AbstractSequence {

  private final A027358 mSeq1 = new A027358();

  /** Construct the sequence. */
  public A053250() {
    super(0);
  }

  private Sequence mA = null;
  private boolean mSign = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new A027357();
      return Z.ONE;
    }
    mSign = !mSign;
    return mSign ? mSeq1.next().subtract(mA.next()) : mA.next().subtract(mSeq1.next());
  }
}
