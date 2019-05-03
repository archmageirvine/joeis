package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.ArrayList;

/**
 * A002955 Number of <code>(unordered, unlabeled)</code> rooted trimmed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A002955 extends MemorySequence {

  private final ArrayList<Z> mCache = new ArrayList<>();

  {
    add(Z.ZERO); // 0th term, needed for A002988, A002989
  }

  protected Z b(final int n) {
    return get(n).subtract(n == 2 ? 1 : 0);
  }

  private Z sum(final int n) {
    while (n >= mCache.size()) {
      Z s = Z.ZERO;
      for (final Z d : Cheetah.factor(mCache.size()).divisors()) {
        s = s.add(d.multiply(b(d.intValueExact())));
      }
      mCache.add(s);
    }
    return mCache.get(n);
  }

  @Override
  protected Z computeNext() {
    if (size() <= 1) {
      return Z.ONE;
    }
    Z s = sum(size() - 1);
    for (int k = 1; k < size() - 1; ++k) {
      s = s.add(sum(k).multiply(get(size() - k)));
    }
    return s.divide(size() - 1);
  }
}
