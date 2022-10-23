package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000045;

/**
 * A024830 a(n) = least m such that if r and s in {F(2*h)/F(2*h+1): h = 1,2,...,n} satisfy r &lt; s, then r &lt; k/m &lt; s for some integer k, where F = A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024830 extends Sequence2 {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 1;
  private long mM = 7;

  private long f(final int n) {
    return mF.a(n).longValueExact();
  }

  private boolean check() {
    for (int r = 1; r < mN; ++r) {
      final long k = f(2 * r) * mM / f(2 * r + 1) + 1;
      for (int s = r + 1; s <= mN; ++s) {
        if (f(2 * s + 1) * k >= f(2 * s) * mM) {
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
