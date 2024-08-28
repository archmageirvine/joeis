package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072005.
 * @author Sean A. Irvine
 */
public class A072050 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(7);
    Z t = mA;
    while (true) {
      final Z r = Functions.REVERSE.z(t);
      if (r.mod(mA).isZero() && Functions.GCD.z(t, r).equals(mA)) {
        return t;
      }
      t = t.add(mA);
    }
  }
}
