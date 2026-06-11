package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a083.A083663;

/**
 * A084730 Smallest prime of the form k*n! - 1.
 * @author Sean A. Irvine
 */
public class A084730 extends AbstractSequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  private final A083663 mSeq = new A083663();

  /** Construct the sequence. */
  public A084730() {
    super(2);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mSeq.next()).subtract(1);
  }
}
