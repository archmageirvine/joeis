package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034969 a(1) = a(2) = 1, a(n) is largest prime factor of concatenation of a(n - 2) and a(n - 1).
 * @author Sean A. Irvine
 */
public class A034969 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z[] f = Jaguar.factor(new Z(mA.toString() + mB)).toZArray();
    final Z lpf = f[f.length - 1];
    mA = mB;
    mB = lpf;
    return lpf;
  }
}
