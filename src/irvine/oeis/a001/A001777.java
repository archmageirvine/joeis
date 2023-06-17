package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001777 Lah numbers: a(n) = n! * binomial(n-1, 4)/5!.
 * @author Sean A. Irvine
 */
public class A001777 extends AbstractSequence {

  /* Construct the sequence. */
  public A001777() {
    super(5);
  }

  private long mN = 4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(mN).multiply(mN - 1).divide(mN - 5);
    }
    return mA;
  }
}
