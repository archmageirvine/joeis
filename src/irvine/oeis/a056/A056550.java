package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A056550 Numbers k such that Sum_{j=1..k} sigma(j) is divisible by k, where sigma(j) = sum of divisors of j (A000203).
 * @author Sean A. Irvine
 */
public class A056550 extends A000203 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
