package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024832 Least m such that if r and s in <code>{Pi/2 - atn(h): h = 1,2,...,n}</code> satisfy r <code>&lt;</code> s, then r <code>&lt; k/m &lt;</code> s for some integer k.
 * @author Sean A. Irvine
 */
public class A024832 implements Sequence {

  private int mN = 1;
  private long mM = 2;

  private CR f(final int n) {
    return CR.HALF_PI.subtract(ComputableReals.SINGLETON.atan(CR.valueOf(n)));
  }

  private boolean check() {
    for (int r = 2; r <= mN; ++r) {
      final CR k = CR.valueOf(f(r).multiply(mM).floor().add(1));
      for (int s = 1; s < r; ++s) {
        if (k.divide(f(s)).compareTo(CR.valueOf(mM)) >= 0) {
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
