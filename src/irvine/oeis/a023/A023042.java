package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023042.
 * @author Sean A. Irvine
 */
public class A023042 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z w3 = Z.valueOf(++mN).pow(3);
      for (long x = mN / 3; x < mN; ++x) {
        final Z x3 = Z.valueOf(x).pow(3);
        final Z s = w3.subtract(x3);
        for (long y = s.root(3).divide2().longValueExact(); y < x; ++y) {
          final Z y3 = Z.valueOf(y).pow(3);
          final Z z3s = s.subtract(y3);
          if (z3s.signum() >= 0) {
            final Z zs = z3s.root(3);
            if (z3s.auxiliary() == 1 && zs.longValueExact() < y) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
