package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022906 a(n) = M(n) - m(n) for n &gt;= 2, where M(n) = max{ a(i) + a(n-i): i = 1..n-1 }, m(n) = min{ a(i) + a(n-i): i = 1..n-1 }.
 * @author Sean A. Irvine
 */
public class A022906 extends MemorySequence {

  protected Z mMin = Z.ZERO;
  protected Z mMax = Z.ZERO;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      mMin = Z.TWO; // needed for A022909
      mMax = Z.TWO; // needed for A022909
      return Z.ZERO;
    }
    mMax = Z.ZERO;
    mMin = Z.valueOf(n);
    for (int k = 0; k < n - 1; ++k) {
      final Z ak = get(n - k - 1).add(get(k));
      mMax = mMax.max(ak);
      mMin = mMin.min(ak);
    }
    return mMax.subtract(mMin);
  }
}
