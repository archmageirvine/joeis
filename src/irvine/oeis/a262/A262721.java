package irvine.oeis.a262;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A262721 Modified Look and Say sequence: compute sum of digits of previous term, square it, and apply the "Say What You See" process.
 * @author Sean A. Irvine
 */
public class A262721 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = Functions.LOOK_AND_SAY.z(Functions.DIGIT_SUM.z(mA).square());
    }
    return mA;
  }
}
