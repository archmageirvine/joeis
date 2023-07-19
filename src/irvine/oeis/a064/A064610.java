package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064610 Places k where A064608(k) (partial sums of unitary tau) is divisible by k.
 * @author Sean A. Irvine
 */
public class A064610 extends A064608 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
