package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a014.A014085;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084597 Largest k such that there are exactly n primes between k^2 and (k+1)^2.
 * @author Sean A. Irvine
 */
public class A084597 extends Sequence2 {

  private static final long HEURISTIC = 5;
  private final Sequence mS = new A014085().skip(2);
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 1;
  private long mA = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (HEURISTIC * (mN + 1) > mA) {
      ++mM;
      mA = mS.next().longValueExact();
      if (mA < mN) {
        throw new RuntimeException("Earlier result for " + mA + " was incorrect");
      }
      mCounts.set(mA, mM);
    }
    return Z.valueOf(mCounts.get(mN));
  }
}

