package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071406 a(n) is the smallest multiplier of n! such that -1+a(n)*n! and 1+a(n)*n! are both primes.
 * @author Sean A. Irvine
 */
public class A071406 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    long k = 0;
    while (true) {
      final Z kf = mF.multiply(++k);
      if (kf.subtract(1).isProbablePrime() && kf.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
