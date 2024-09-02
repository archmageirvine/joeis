package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072018 Numbers k for which gcd(k, reverse(k)) = 243 = 3^5.
 * @author Sean A. Irvine
 */
public class A072018 extends Sequence1 {

  private static final Z C = Z.valueOf(243);
  private Z mA = Z.valueOf(4899999744L);

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
