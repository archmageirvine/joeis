package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064916 a(n) = n/lpf(n) + lpf(n) - 1, where lpf = A020639 = least prime factor.
 * @author Sean A. Irvine
 */
public class A064916 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z lpf = Functions.LPF.z(mN);
    return mN.divide(lpf).add(lpf).subtract(1);
  }
}

