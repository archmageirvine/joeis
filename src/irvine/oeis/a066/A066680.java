package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A066680 Badly sieved numbers: as in the Sieve of Eratosthenes multiples of unmarked numbers p are marked, but only up to p^2.
 * @author Sean A. Irvine
 */
public class A066680 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = 1;

  @Override
  public Z next() {
    while (mA.isSet(++mN)) {
      // do nothing
    }
    final long p2 = mN * mN;
    for (long k = 2 * mN; k <= p2; k += mN) {
      mA.set(k);
    }
    return Z.valueOf(mN);
  }
}
