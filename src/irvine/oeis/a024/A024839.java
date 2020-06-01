package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024839 Least m such that if r and s in <code>{1/4, 1/8, 1/12</code>, ..., <code>1/4n}</code> satisfy r <code>&lt;</code> s, then r <code>&lt; k/m &lt; (k+1)/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024839 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 8; r <= 4 * mN; r += 4) {
      final long k = mM / r + 1;
      for (long s = 4; s < r; s += 4) {
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
