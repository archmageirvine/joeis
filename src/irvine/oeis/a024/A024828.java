package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024828 a(n) = least m such that if r and s in {h/(1 + h^2): h = 1,2,...,n} satisfy r &lt; s, then r &lt; k/m &lt; s for some integer k.
 * @author Sean A. Irvine
 */
public class A024828 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = r * mM / (r * r + 1) + 1;
      for (long s = 1; s < r; ++s) {
        if ((s * s + 1) * k >= s * mM) {
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
