package irvine.oeis.a359;

import java.util.HashSet;
import java.util.function.Function;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A359734 Lexicographically earliest sequence of distinct nonnegative integers such that the sequence A051699(a(n)) (distance from the nearest prime) has the same sequence of digits.
 * @author Sean A. Irvine
 */
public class A359734 extends Sequence0 {

  // After M. F. Hasler

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
    this(Puma::primeZ, 1);
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
