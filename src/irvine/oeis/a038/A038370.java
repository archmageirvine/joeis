package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038370 Smallest prime with "n^2" as central digit(s).
 * @author Sean A. Irvine
 */
public class A038370 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String centre = String.valueOf(++mN * mN);
    long limit = 1;
    while (true) {
      final long start = limit;
      limit *= 10;
      final long rlim = limit * 10;
      for (long left = start; left < limit; ++left) {
        final String l = left + centre;
        for (long right = limit; right < rlim; ++right) {
          // Generates 100...0 then substring(1) to handle leading zeros
          final Z candidate = new Z(l + String.valueOf(right).substring(1));
          if (candidate.isProbablePrime()) {
            return candidate;
          }
        }
      }
    }
  }
}
