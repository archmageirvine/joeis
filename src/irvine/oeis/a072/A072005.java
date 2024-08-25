package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072005 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    Z t = mA;
    while (true) {
      final Z r = Functions.REVERSE.z(t);
      if (r.mod(mA).isZero() && Functions.GCD.z(t, Functions.REVERSE.z(t)).equals(mA)) {
        return t;
      }
      t = t.add(mA);
    }
  }
}
