package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001730 a(n) = n!/6!.
 * @author Sean A. Irvine
 */
public class A001730 extends AbstractSequence {

  /** Construct the sequence. */
  public A001730() {
    super(6);
  }

  private long mN = 5;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 6) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

}
