package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024827 Least m such that if r and s in <code>{1/1, 1/4, 1/9,..., 1/n^2}</code> satisfy r <code>&lt</code>; s, then r <code>&lt; k/m &lt</code>; s for some integer k.
 * @author Sean A. Irvine
 */
public class A024827 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = mM / (r * r) + 1;
      for (long s = 1; s < r; ++s) {
        if (s * s * k >= mM) {
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
