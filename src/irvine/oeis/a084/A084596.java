package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a014.A014085;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084596 a(n) is the number of times n is in sequence A014085; i.e., there are exactly a(n) cases where there are exactly n primes between m^2 and (m+1)^2 for m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A084596 extends A014085 {

  private static final long HEURISTIC = 5;
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mA = 0;

  @Override
  public Z next() {
    ++mN;
    while (HEURISTIC * (mN + 1) > mA) {
      mA = super.next().longValueExact();
      if (mA < mN) {
        throw new RuntimeException("Earlier result for " + mA + " was incorrect");
      }
      mCounts.increment(mA);
    }
    return Z.valueOf(mCounts.get(mN));
  }
}

