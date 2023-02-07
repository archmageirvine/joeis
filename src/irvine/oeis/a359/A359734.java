package irvine.oeis.a359;

import java.util.HashSet;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A359734 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A359734 extends Sequence0 {

  // After M. F. Hasler

  private static final MemorySequence PRIMES = MemorySequence.cachedSequence(new A000040());
  private final HashSet<Long> mS = new HashSet<>();
  private final StringBuilder mD = new StringBuilder();
  private final int mMinValidIndex;
  private final Function<Integer, Z> mF;

  protected A359734(final Function<Integer, Z> f, final int minValidIndex) {
    mF = f;
    mMinValidIndex = minValidIndex;
  }

  /** Construct the sequence. */
  public A359734() {
    this(k -> PRIMES.a(k - 1), 1);
  }

  @Override
  public Z next() {
    int j = 1;
    long k = -1;
    while (true) {
      if (mS.contains(++k)) {
        continue;
      }
      long u;
      while ((u = mF.apply(j).longValueExact()) < k) {
        ++j;
      }
      u -= k;
      if (j > mMinValidIndex) {
        u = Math.min(u, k - mF.apply(j - 1).longValueExact());
      }
      final String m = Long.toString(u);
      if ((mD + Long.toString(k)).startsWith(m)) {
        mD.append(k).delete(0, m.length());
        mS.add(k);
        return Z.valueOf(k);
      }
    }
  }
}
