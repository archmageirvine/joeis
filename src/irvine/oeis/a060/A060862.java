package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060862 a(n) = 0 if n is deficient, 1 if n is abundant, 2 if n is perfect.
 * @author Sean A. Irvine
 */
public class A060862 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final int sign = mN.multiply2().subtract(Functions.SIGMA.z(mN)).signum();
    switch (sign) {
      case 0:
        return Z.TWO;
      case -1:
        return Z.ONE;
      case 1:
      default:
        return Z.ZERO;
    }
  }
}
