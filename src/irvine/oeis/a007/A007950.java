package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007950 Binary sieve: delete every 2nd number, then every 4th, 8th, etc.
 * @author Sean A. Irvine
 */
public class A007950 extends Sequence1 {

  // We don't actually want to do this as a real "sieve".
  // Instead using something more incremental but still fast

  private final long[] mCounters = new long[64]; // good for 2^64 terms
  // mCounters[k] counts up to 2^k, then we delete the number
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long limit = 2;
      boolean retained = true;
      for (int k = 0; k < mCounters.length; ++k, limit <<= 1) {
        if (++mCounters[k] == limit) {
          // mN is nixed by being the 2^k-th element
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
