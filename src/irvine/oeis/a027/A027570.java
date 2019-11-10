package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027570 Initial members of prime decaplets <code>(p, p+2, p+6, p+12, p+14, p+20, p+24, p+26, p+30, p+32)</code>.
 * @author Sean A. Irvine
 */
public class A027570 implements Sequence {

  // Slow ...

  private static final long[] DELTAS = {0, 2, 6, 12, 14, 20, 24, 26, 30, 32};
  private long mN = 9853497527L;

  @Override
  public Z next() {
    while (true) {
      mN += 210;
      if (A027569.isPrime(mN, DELTAS)) {
        return Z.valueOf(mN);
      }
    }
  }
}
