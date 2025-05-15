package irvine.oeis.a383;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A383421 a(1)=1; thereafter if a(n-1) is a first occurrence, then a(n) is the number of values that occur exactly once in the sequence thus far. Otherwise; a(n) is the number of terms that are the same distance away from an earlier equal value as a(n-1) is from its previous last occurrence.
 * @author Sean A. Irvine
 */
public class A383421 extends CachedSequence {

  // This is not the most efficient implementation
  private final HashSet<Long> mSeen = new HashSet<>();
  private final HashSet<Long> mOnce = new HashSet<>();

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
      mOnce.add(1L);
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
        if (mSeen.add(cnt)) {
          mOnce.add(cnt);
        } else {
          mOnce.remove(cnt);
        }
        return Z.valueOf(cnt);
      }
    }
    final long res = mOnce.size();
    if (mSeen.add(res)) {
      mOnce.add(res);
    } else {
      mOnce.remove(res);
    }
    return Z.valueOf(res);
  }
}

