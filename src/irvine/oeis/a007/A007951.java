package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007951 Ternary sieve: delete every 3rd number, then every 9th, 27th, etc.
 * @author Sean A. Irvine
 */
public class A007951 extends Sequence1 {

  // We don't actually want to do this as a real "sieve".
  // Instead using something more incremental but still fast

  private final long[] mCounters = new long[64]; // good for 2^64 terms
  // mCounters[k] counts up to 3^k, then we delete the number
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long limit = 3;
      boolean retained = true;
      for (int k = 0; k < mCounters.length; ++k, limit *= 3) {
        if (++mCounters[k] == limit) {
          // mN is nixed by being the 3^k-th element
          mCounters[k] = 0; // reset that counter
          retained = false;
          break;
        }
      }
      if (retained) {
        return Z.valueOf(mN);
      }
    }
  }
}
