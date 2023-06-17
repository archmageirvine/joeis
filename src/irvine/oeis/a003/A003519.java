package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003519 a(n) = 10*C(2n+1, n-4)/(n+6).
 * @author Sean A. Irvine
 */
public class A003519 extends AbstractSequence {

  /* Construct the sequence. */
  public A003519() {
    super(4);
  }

  private Z mA = Z.ONE;
  protected long mN = 3;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(2 * mN + 1).multiply(2 * mN).divide(mN + 6).divide(mN - 4);
    }
    return mA;
  }
}
