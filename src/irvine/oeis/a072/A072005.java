package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072005 Smallest solution to gcd(k, reverse(k)) = 3^n.
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
      if (r.mod(mA).isZero() && Functions.GCD.z(t, r).equals(mA)) {
        return t;
      }
      t = t.add(mA);
    }
  }
}
