package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024826 Least m such that if r and s in <code>{1/1, 1/3, 1/6,..., 1/C(n+1,2)}</code> satisfy r <code>&lt</code>; s, then r <code>&lt; k/m &lt</code>; s for some integer k.
 * @author Sean A. Irvine
 */
public class A024826 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = mM / Binomial.binomial(r + 1, 2).longValueExact() + 1;
      for (long s = 1; s < r; ++s) {
        if (Binomial.binomial(s + 1, 2).longValueExact() * k >= mM) {
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
