package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024824 <code>a(n) =</code> least m such that if r and s in <code>{1/3, 1/6, 1/9,..., 1/3n}</code> satisfy r &lt; s, then r <code>&lt; k/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024824 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 6; r <= 3 * mN; r += 3) {
      final long k = mM / r + 1;
      for (long s = 3; s < r; s += 3) {
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
      ++mM;
      if (check()) {
        return Z.valueOf(mM);
      }
    }
  }
}
