package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072016 Numbers k such that gcd(k, reverse(k)) = 27 = 3^3, where reverse(x) = A004086(x).
 * @author Sean A. Irvine
 */
public class A072016 extends Sequence1 {

  private static final Z C = Z.valueOf(27);
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(C);
      final Z r = Functions.REVERSE.z(mA);
      if (r.mod(C).isZero() && Functions.GCD.z(mA, r).equals(C)) {
        return mA;
      }
    }
  }
}
