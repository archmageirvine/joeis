package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027569 Initial members of prime decaplets <code>(p, p+2, p+6, p+8, p+12, p+18, p+20, p+26, p+30, p+32)</code>.
 * @author Sean A. Irvine
 */
public class A027569 implements Sequence {

  // Slow ...

  private static final long[] DELTAS = {0, 2, 6, 8, 12, 18, 20, 26, 30, 32};
  private static final Fast PRIME = new Fast();
  private long mN = -199;

  static boolean isPrime(final long n, final long... deltas) {
    for (final long d : deltas) {
      if (!PRIME.isPrime(n + d)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 210;
      if (isPrime(mN, DELTAS)) {
        return Z.valueOf(mN);
      }
    }
  }
}
