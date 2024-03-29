package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A024831 a(n) = least m such that if r and s in {F(h)/F(2*h): h = 1,2,...,n} satisfy r &lt; s, then r &lt; k/m &lt; s for some integer k, where F = A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024831 extends Sequence2 {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 1;
  private long mM = 1;

  private long f(final int n) {
    return mF.a(n).longValueExact();
  }

  private boolean check() {
    for (int r = 2; r <= mN; ++r) {
      final long k = f(r) * mM / f(2 * r) + 1;
      for (int s = 1; s < r; ++s) {
        if (f(2 * s) * k >= f(s) * mM) {
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
