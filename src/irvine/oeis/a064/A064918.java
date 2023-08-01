package irvine.oeis.a064;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064918 a(n) is the number of iterations of k -&gt; A064916(k) to reach a prime, starting at n.
 * @author Sean A. Irvine
 */
public class A064918 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long cnt = 0;
    while (!m.isProbablePrime()) {
      final Z lpf = LeastPrimeFactorizer.lpf(m);
      m = m.divide(lpf).add(lpf).subtract(1);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

