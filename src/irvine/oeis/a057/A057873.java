package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A057873 a(1) = 1; a(n+1) = sum of terms in continued fraction for sum{k=1 to n}[a(n+1-k)/a(k)].
 * @author Sean A. Irvine
 */
public class A057873 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else {
      Q sum = Q.ZERO;
      for (int k = 1; k < n; ++k) {
        sum = sum.add(new Q(get(n - k), get(k)));
      }
      Q p0 = sum;
      Q p1 = Q.ONE;
      Z s = Z.ZERO;
      while (!Q.ZERO.equals(p1)) {
        final Z a = p0.divide(p1).floor();
        s = s.add(a);
        final Q t = p0.subtract(p1.multiply(a));
        p0 = p1;
        p1 = t;
      }
      return s;
    }
  }
}
