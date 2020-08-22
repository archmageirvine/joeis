package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023040 w such that w^3+x^3+y^3+z^3=0, w&gt;|x|&gt;|y|&gt;|z|, is soluble (all solutions).
 * @author Sean A. Irvine
 */
public class A023040 implements Sequence {

  private long mN = 5;

  private boolean isSolvable(final Z s, final long x) {
    for (long y = s.root(3).divide2().longValueExact(); y < x; ++y) {
      final Z y3 = Z.valueOf(y).pow(3);
      final Z z3s = s.subtract(y3);
      final Z zs = z3s.root(3);
      if (z3s.auxiliary() == 1 && Math.abs(zs.longValueExact()) < y) {
        return true;
      }
      final Z z3a = s.add(y3);
      final Z za = z3a.root(3);
      if (z3a.auxiliary() == 1 && Math.abs(za.longValueExact()) < y) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z w3 = Z.valueOf(++mN).pow(3);
      for (long x = mN / 3; x < mN; ++x) {
        final Z x3 = Z.valueOf(x).pow(3);
        if (isSolvable(w3.subtract(x3), x) || isSolvable(w3.add(x3), x)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
