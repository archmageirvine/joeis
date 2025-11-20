package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081949 Smallest square which is one more than the product of n (not necessarily distinct) numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A081949 extends Sequence1 {

  private long mN = 0;
  private Z mMin = null;

  private void search(final Z prod, final long prev, final long remaining) {
    if (remaining <= 0) {
      if ((mMin == null || prod.compareTo(mMin) < 0) && Predicates.SQUARE.is(prod.add(1))) {
        mMin = prod;
      }
      return;
    }
    long k = prev;
    while (true) {
      if (mMin != null) {
        final Z u = prod.multiply(Z.valueOf(k).pow(remaining));
        if (u.compareTo(mMin) > 0) {
          break;
        }
      }
      final Z pr = prod.multiply(k);
      search(pr, k, remaining - 1);
      ++k;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMin = null;
    search(Z.ONE, 2, mN);
    return mMin.add(1);
  }
}
