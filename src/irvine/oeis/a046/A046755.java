package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046755 Numbers k such that d(k)^3 divides k.
 * @author Sean A. Irvine
 */
public class A046755 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Functions.SIGMA0.z(mN).pow(3)).isZero()) {
        return mN;
      }
    }
  }
}
