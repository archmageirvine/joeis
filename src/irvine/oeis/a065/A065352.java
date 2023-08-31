package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065352 Smallest m such that C(2m,m) is divisible by (m+n)!/m!.
 * @author Sean A. Irvine
 */
public class A065352 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z mod = mF;
    long m = 0;
    Z c = Z.ONE;
    while (true) {
      mod = mod.divide(++m).multiply(mN + m);
      c = c.multiply(4 * m - 2).divide(m);
      if (c.mod(mod).isZero()) {
        return Z.valueOf(m);
      }
    }
  }
}
