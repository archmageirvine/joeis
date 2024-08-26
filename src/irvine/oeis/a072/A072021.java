package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072021 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(5);
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
