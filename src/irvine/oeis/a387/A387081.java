package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a386.A386482;

/**
 * A387081 Indices k such that lpf(s(k-1)) does not divide abs(s(k) - s(k-1)), where s = A386482 and lpf = A020639.
 * @author Sean A. Irvine
 */
public class A387081 extends A386482 {

  private Z mA = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (!mA.subtract(t).abs().mod(Functions.LPF.z(t)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
