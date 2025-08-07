package irvine.oeis.a384;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384693 a(n) is the number of lattice points (r,s) such that 0&lt;r,s&lt;=n and ((r^2+s^2)*d - r*d^2)/r is a square for some integer d with 0&lt;d&lt;r.
 * @author Sean A. Irvine
 */
public class A384693 extends Sequence0 {

  private long mN = -1;
  private long mA = 0;

  private boolean is(final long r, final long s) {
    for (long d = 1; d < r; ++d) {
      final Z v = Z.valueOf(r * r + s * s - r * d).multiply(d);
      if (v.mod(r) == 0 && Predicates.SQUARE.is(v.divide(r))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN > 3) {
      for (int s = 1; s <= mN; ++s) {
        if (is(mN, s)) {
          ++mA;
        }
      }
      for (int r = 1; r < mN; ++r) {
        if (is(r, mN)) {
          ++mA;
        }
      }
    }
    return Z.valueOf(mA);
  }
}

