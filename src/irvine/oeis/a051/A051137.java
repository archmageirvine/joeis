package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051137 Table T(n,k) read by antidiagonals: number of necklaces allowing turnovers (bracelets) with n beads of k colors.
 * @author Sean A. Irvine
 */
public class A051137 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Z zk = Z.valueOf(k);
    for (final Z d : Cheetah.factor(n).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(zk.pow(n / d.intValue())));
    }
    sum = sum.divide(n);
    sum = sum.add(zk.pow((n + 1) / 2).add(zk.pow((n + 2) / 2)).divide2());
    return sum.divide2();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
    }
    return t(mM, mN - mM);
  }
}

