package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000698 A problem of configurations: <code>a(0) = 1</code>; for <code>n&gt;0, a(n) = (2n-1)!! - Sum_{k=1..n-1} (2k-1)!! a(n-k)</code>. Also the number of shellings of an n-cube, divided by <code>2^n n!</code>.
 * @author Sean A. Irvine
 */
public class A000698 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    } else {
      Z f = Z.ONE;
      Z s = Z.ZERO;
      for (int k = 1; k < n; ++k) {
        f = f.multiply(2 * k - 1);
        s = s.add(f.multiply(get(n - k)));
      }
      return f.multiply(2 * n - 1).subtract(s);
    }
  }
}
