package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024836 a(n) = least m such that if r and s in {1/1, 1/4, 1/7, ..., 1/(3n-2)} satisfy r &lt; s, then r &lt; k/m &lt; (k+1)/m &lt; s for some integer k.
 * @author Sean A. Irvine
 */
public class A024836 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 4; r <= 3 * mN; r += 3) {
      final long k = mM / r + 1;
      for (long s = 1; s < r; s += 3) {
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
