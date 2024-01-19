package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A068007 Least number k such that the number of primes of the form [k/j] for j=1..k (A067514) is n, or zero if impossible.
 * @author Sean A. Irvine
 */
public class A068007 extends Sequence1 implements Conjectural {

  private static final long HEURISITIC = 10;
  private final Sequence mA = new A068050();
  private final LongDynamicLongArray mFirst = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0 && mM < (mN + 1) * HEURISITIC) {
      ++mM;
      final long t = mA.next().longValueExact();
      if (mFirst.get(t) == 0) {
        if (t < mN) {
          throw new UnsupportedOperationException("Heuristic failure detected, previously reported a(" + t + ")=0 was incorrect, it should be " + mM);
        }
        mFirst.set(t, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}
