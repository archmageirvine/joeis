package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001807 a(n) = n! * binomial(n,5).
 * @author Sean A. Irvine
 */
public class A001807 extends AbstractSequence {

  /** Construct the sequence. */
  public A001807() {
    super(5);
  }

  private long mN = 4;
  private Z mA = Z.valueOf(120);

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 5);
    }
    return mA;
  }
}
