package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000458 a(0) = a(1) = 1; thereafter a(n) = sigma(a(n-1)) + sigma(a(n-2)).
 * @author Sean A. Irvine
 */
public class A000458 extends Sequence0 {

  private Z mA = null;
  private Z mASigma = Z.ONE;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z s = Functions.SIGMA.z(mB);
      final Z t = mASigma.add(s);
      mA = mB;
      mB = t;
      mASigma = s;
    }
    return mB;
  }
}
