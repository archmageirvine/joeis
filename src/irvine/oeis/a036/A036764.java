package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036764 If n can be expressed as m/d(m) for some m, where d(m) is the number of divisors of m (A000005), then a(n) is the smallest such m, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A036764 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.mod(9) == 0 && mN.divide(9).isProbablePrime()) {
      return Z.ZERO;
    }
    final Z lim = mN.square().multiply(4);
    for (Z k = Z.ONE; k.compareTo(lim) <= 0; k = k.add(1)) {
      final Z p = mN.multiply(k);
      if (p.equals(mN.multiply(Functions.SIGMA0.z(p)))) {
        return p;
      }
    }
    return Z.ZERO;
  }
}
