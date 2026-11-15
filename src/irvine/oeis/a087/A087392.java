package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087392 a(1) = 1, a(n) = smallest multiple of n beginning with the digit reversal of a(n-1).
 * @author Sean A. Irvine
 */
public class A087392 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    ++mN;
    final Z r = Functions.REVERSE.z(mA);
    final String rs = r.toString();
    Z t = Z.TEN;
    while (true) {
      mA = r.multiply(t).add(mN - 1).divide(mN).multiply(mN);
      if (mA.toString().startsWith(rs)) {
        return mA;
      }
      t = t.multiply(10);
    }
  }
}

