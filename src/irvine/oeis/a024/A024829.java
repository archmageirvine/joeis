package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A024829 <code>a(n) =</code> least m such that if r and s in <code>{F(2*h-1)/F(2*h): h = 1,2,...,n}</code> satisfy r &lt; s, then r <code>&lt; k/m &lt;</code> s for some integer k, where F <code>= A000045</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024829 implements Sequence {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 1;
  private long mM = 2;

  private long f(final int n) {
    return mF.a(n).longValueExact();
  }

  private boolean check() {
    for (int r = 2; r <= mN; ++r) {
      final long k = f(2 * r - 1) * mM / f(2 * r) + 1;
      for (int s = 1; s < r; ++s) {
        if (f(2 * s) * k >= f(2 * s - 1) * mM) {
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
