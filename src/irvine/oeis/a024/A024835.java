package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024835 <code>a(n) =</code> least m such that if r and s in <code>{1/2, 1/4, 1/6</code>, ..., <code>1/2n}</code> satisfy r <code>&lt;</code> s, then r <code>&lt; k/m &lt; (k+1)/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024835 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 4; r <= 2 * mN; r += 2) {
      final long k = mM / r + 1;
      for (long s = 2; s < r; s += 2) {
        if (s * (k + 1) >= mM) {
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
