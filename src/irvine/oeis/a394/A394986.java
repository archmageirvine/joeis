package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394986 allocated for Leo Hennig.
 * @author Sean A. Irvine
 */
public class A394986 extends Sequence1 {

  private long mN = 5;

  private boolean is(final Z[] s, final Z[] cum, final Z sum, final int pos) {
    if (pos < 0) {
      return sum.isZero();
    }
    final Z sp = sum.add(s[pos]);
    if ((pos == 0 || sp.abs().subtract(cum[pos - 1]).signum() <= 0) && is(s, cum, sp, pos - 1)) {
      return true;
    }
    final Z sn = sum.subtract(s[pos]);
    if ((pos == 0 || sn.abs().subtract(cum[pos - 1]).signum() <= 0) && is(s, cum, sn, pos - 1)) {
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.SIGMA.z(2, mN).isEven()) {
        final Z[] d = Jaguar.factor(mN).divisorsSorted();
        // Precompute squares
        final Z[] s = new Z[d.length];
        for (int k = 0; k < d.length; ++k) {
          s[k] = d[k].square();
        }
        // Cumulative (for fast rejection in search)
        final Z[] cum = new Z[d.length];
        cum[0] = s[0];
        for (int k = 1; k < s.length; ++k) {
          cum[k] = cum[k - 1].add(s[k]);
        }
        if (is(s, cum, Z.valueOf(mN), d.length - 2)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
