package irvine.oeis.a062;

import irvine.math.z.Carmichael;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062373 Ratio of totient to Carmichael's lambda function is 2.
 * @author Sean A. Irvine
 */
public class A062373 extends Sequence1 {

  private final Z mTarget;
  private Z mN = Z.ZERO;

  protected A062373(final Z target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A062373() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Euler.phi(mN);
      final Z c = Carmichael.lambda(mN);
      if (phi.equals(c.multiply(mTarget))) {
        return mN;
      }
    }
  }
}
