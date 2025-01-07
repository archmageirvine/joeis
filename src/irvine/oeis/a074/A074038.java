package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a007.A007510;

/**
 * A074038 If n is the k-th single (i.e., non-twin) prime then a(n) = k, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A074038 extends A007510 {

  private long mN = 0;
  private long mM = 0;
  private long mA = super.next().longValueExact();

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      return Z.valueOf(++mM);
    }
    return Z.ZERO;
  }
}
