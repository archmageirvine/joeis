package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064921 Iterate A064920 until a prime is reached.
 * @author Sean A. Irvine
 */
public class A064921 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (!m.isProbablePrime()) {
      final Z lpf = Functions.GPF.z(m);
      m = m.divide(lpf).add(lpf).subtract(1);
    }
    return m;
  }
}

