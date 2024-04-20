package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064917 a(n) is the result of beginning with n and iterating k -&gt; A064916(k) until a prime is reached.
 * @author Sean A. Irvine
 */
public class A064917 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (!m.isProbablePrime()) {
      final Z lpf = Functions.LPF.z(m);
      m = m.divide(lpf).add(lpf).subtract(1);
    }
    return m;
  }
}

