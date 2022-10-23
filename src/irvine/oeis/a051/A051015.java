package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051015 Zeisel numbers.
 * @author Sean A. Irvine
 */
public class A051015 extends Sequence1 {

  // After M. F. Hasler

  private long mN = 104;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() <= 2) {
      return false;
    }
    if (fs.maxExponent() != 1) {
      return false;
    }
    final Z[] p = fs.toZArray();
    final Q q = new Q(p[2].subtract(p[1]), p[1].subtract(p[0]));
    if (!q.isInteger()) {
      return false;
    }
    final Z e = q.toZ();
    final Z s0 = p[0].subtract(e);
    for (int k = 1; k < p.length; ++k) {
      final Z sk = p[k].subtract(e.multiply(p[k - 1]));
      if (!sk.equals(s0)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
