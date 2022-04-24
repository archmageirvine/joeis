package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A056550 Numbers n such that sum_{k=1..n} sigma(k) is divisible by n, where sigma(k) = sum of divisors of k (A000203).
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
