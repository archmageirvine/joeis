package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035250;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078754 Numbers n such that for all m&gt;n there are more than k primes between m and 2m (inclusive).
 * @author Sean A. Irvine
 */
public class A078754 extends Sequence1 {

  private static final long HEURISTIC = 10;
  private final Sequence mSeq = new A035250();
  private final LongDynamicLongArray mLasts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mLasts.get(mN) == 0 || HEURISTIC * mLasts.get(mN) > mM) {
      ++mM;
      final long t = mSeq.next().longValueExact();
      mLasts.set(t, mM);
      mLasts.truncate(t + 1); // invalidate all larger values
    }
    return Z.valueOf(mLasts.get(mN));
  }
}
