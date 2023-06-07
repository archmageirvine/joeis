package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a071.A071148;

/**
 * A064013 Sum of first n^2 odd primes (=S) is divisible by n and S/n = n mod 2.
 * @author Sean A. Irvine
 */
public class A064013 extends A071148 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN * mN;
      while (++mM < s) {
        super.next();
      }
      final Z t = super.next();
      if (t.mod(mN) == 0 && t.divide(mN).mod(2) == (mN & 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
