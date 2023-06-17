package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001720 a(n) = n!/24.
 * @author Sean A. Irvine
 */
public class A001720 extends AbstractSequence {

  /** Construct the sequence. */
  public A001720() {
    super(4);
  }

  private long mN = 3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

}
