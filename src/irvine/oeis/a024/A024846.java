package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024846 <code>a(n) =</code> least m such that if r and s in <code>{1/1, 1/2, 1/3</code>, ..., <code>1/n}</code> satisfy r &lt; s, then r <code>&lt; k/m &lt; (k+4)/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024846 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = mM / r + 1;
      for (long s = 1; s < r; ++s) {
        // (1/r) < (1/s), (mM / r) < (mM / s)
        if (s * (k + 4) >= mM) {
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
