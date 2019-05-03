package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.HashSet;

/**
 * A165418 <code>a(1) = 1</code>. For <code>n &gt;= 2, a(n) =</code> sum <code>a(k)</code>, where k is over the distinct values of the substrings in binary n, and where <code>1 &lt;= k &lt</code>; n.
 * @author Sean A. Irvine
 */
public class A165418 extends MemorySequence {

  private int mN = 0;
  {
    add(Z.ZERO);
  }

  private Z sum(final HashSet<Z> set) {
    Z sum = Z.ZERO;
    for (final Z v : set) {
      final int vv = v.intValue();
      sum = sum.add(vv >= size() ? Z.ONE : get(vv));
    }
    return sum;
  }

  private HashSet<Z> buildSet(final long n) {
    final HashSet<Z> h = new HashSet<>();
    if (n == 1) {
      h.add(Z.ONE);
    } else {
      final String s = Long.toBinaryString(n);
      for (int k = 0; k < s.length(); ++k) {
        for (int j = k + 1; j <= s.length(); ++j) {
          if (k > 0 || j < s.length()) {
            h.add(new Z(s.substring(k, j), 2));
          }
        }
      }
    }
    return h;
  }

  @Override
  public Z computeNext() {
    return sum(buildSet(++mN));
  }
}
