package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001806 a(n) = n! * binomial(n,4).
 * @author Sean A. Irvine
 */
public class A001806 extends AbstractSequence {

  /** Construct the sequence. */
  public A001806() {
    super(4);
  }

  private long mN = 3;
  private Z mA = Z.valueOf(24);

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 4);
    }
    return mA;
  }
}
