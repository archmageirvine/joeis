package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A024851 Least m such that if r and s in <code>{-F(2*h) + tau*(F(2*h-1): h = 1,2,...,n}</code> satisfy r &lt; s, then r <code>&lt; k/m &lt;</code> s for some integer k, where F <code>= A000045</code> (Fibonacci numbers) and tau <code>= (1+sqrt(5))/2</code> (golden ratio).
 * @author Sean A. Irvine
 */
public class A024851 implements Sequence {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 1;
  private long mM = 2;

  private CR f(final int n) {
    return CR.valueOf(mF.a(2 * n - 1)).multiply(CR.PHI).subtract(CR.valueOf(mF.a(2 * n)));
  }

  private boolean check() {
    for (int r = 2; r <= mN; ++r) {
      final CR k = CR.valueOf(f(r).multiply(mM).floor().add(1));
      for (int s = 1; s < r; ++s) {
        if (k.divide(f(s)).compareTo(CR.valueOf(mM)) >= 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (check()) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
