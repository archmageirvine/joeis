package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072021 Smallest solution to gcd(x, reverse(x)) = 5^n.
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
      if (r.mod(mA).isZero() && Functions.GCD.z(t, r).equals(mA)) {
        return t;
      }
      t = t.add(mA);
    }
  }
}
