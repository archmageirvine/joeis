package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024847 a(n) = least m such that if r and s in {1/1, 1/3, 1/5, ..., 1/(2n-1)} satisfy r &lt; s, then r &lt; k/m &lt; (k+4)/m &lt; s for some integer k.
 * @author Sean A. Irvine
 */
public class A024847 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 3; r <= 2 * mN; r += 2) {
      final long k = mM / r + 1;
      for (long s = 1; s < r; s += 2) {
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
