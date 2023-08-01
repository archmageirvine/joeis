package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064922 Number of iterations in A064920 to reach a prime.
 * @author Sean A. Irvine
 */
public class A064922 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long cnt = 0;
    while (!m.isProbablePrime()) {
      final Z lpf = Jaguar.factor(m).largestPrimeFactor();
      m = m.divide(lpf).add(lpf).subtract(1);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

