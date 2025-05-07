package irvine.oeis.a383;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A383421 allocated for Neal Gersh Tolunsky.
 * @author Sean A. Irvine
 */
public class A383421 extends CachedSequence {

  // This is not the most efficient implementation
  private final HashSet<Long> mSeen = new HashSet<>();

  /** Construct the sequence. */
  public A383421() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n < 1) {
      return null;
    }
    if (n == 1) {
      mSeen.add(1L);
      return Z.ONE;
    }
    final Z prev = a(n - 1);
    // try to find a previous occurrence
    int k = n - 1;
    while (--k > 0) {
      if (a(k).equals(prev)) {
        final int delta = n - 1 - k;
        long cnt = 0;
        for (int j = n - 1; j > delta; --j) {
          if (a(j).equals(a(j - delta))) {
            ++cnt;
          }
        }
        mSeen.add(cnt);
        return Z.valueOf(cnt);
      }
    }
    final long res = mSeen.size();
    mSeen.add(res);
    return Z.valueOf(res);
  }
}

