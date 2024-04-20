package irvine.oeis.a152;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152466 a(1) = 252, a(n) is a(n-1) multiplied by the smallest prime factor of a(n-1)+1.
 * @author Sean A. Irvine
 */
public class A152466 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(252);
    } else {
      mA = mA.multiply(Functions.LPF.z(mA.add(1)));
    }
    return mA;
  }
}
