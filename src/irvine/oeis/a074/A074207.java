package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074207 Numbers n such that the sum of the first n primes divides n!.
 * @author Sean A. Irvine
 */
public class A074207 extends A000040 {

  private Z mF = Z.ONE;
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mSum = mSum.add(super.next());
      if (mF.mod(mSum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
