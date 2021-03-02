package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039950 Primes of form abs(2*n^2-199).
 * @author Sean A. Irvine
 */
public class A039950 implements Sequence {

  private static final long[] SMALL = {37, 43, 71, 89, 101, 127, 139, 149, 167, 181, 191, 193, 197};
  private int mA = 0;
  private long mN = 14;

  @Override
  public Z next() {
    if (mA < SMALL.length) {
      return Z.valueOf(SMALL[mA++]);
    }
    while (true) {
      final Z candidate = Z.valueOf(++mN).square().multiply2().subtract(199);
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
