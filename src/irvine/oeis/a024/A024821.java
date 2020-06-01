package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024821 Least m such that if r and s in <code>{1/sqrt(h): h = 1,2,...,n}</code> satisfy r <code>&lt;</code> s, then r <code>&lt; k/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024821 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = (long) (mM / Math.sqrt(r)) + 1;
      for (long s = 1; s < r; ++s) {
        // (1/sqrt(r)) < (1/sqrt(s)), (mM / sqrt(r)) < (mM / sqrt(s))
        // Test if there is an integer k between
        if (Math.sqrt(s) * k >= mM) {
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
