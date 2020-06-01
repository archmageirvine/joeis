package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024819 <code>a(n) =</code> least m such that if r and s in <code>{1/1, 1/3, 1/5,..., 1/(2n-1)}</code> satisfy r <code>&lt;</code> s, then r <code>&lt; k/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024819 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 1; r <= 2 * mN - 1; r += 2) {
      final long k = mM / r + 1;
      for (long s = 1; s < r; s += 2) {
        // (1/r) < (1/s), (mM / r) < (mM / s)
        // Test if there is an integer k between
        if (s * k >= mM) {
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
