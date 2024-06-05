package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A005356 Number of low discrepancy sequences in base 2.
 * @author Sean A. Irvine
 */
public class A005356 extends Sequence1 {

  private final ArrayList<Z> mN2 = new ArrayList<>();
  private final ArrayList<Z> mM2 = new ArrayList<>();
  private int mS = 0;

  protected Z power(final int d) {
    return Z.ONE.shiftLeft(d);
  }

  private Z irred(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      final Z z = power(d);
      sum = ZUtils.mobiusAdd(Functions.MOBIUS.i(n / d), sum, z);
    }
    return sum.divide(n);
  }

  private Z n2(final int n) {
    while (n >= mN2.size()) {
      mN2.add(irred(mN2.size()));
    }
    return mN2.get(n);
  }

  private Z m2(final int n) {
    while (n >= mM2.size()) {
      if (n == 0) {
        mM2.add(Z.ZERO);
      } else {
        mM2.add(m2(mM2.size() - 1).add(n2(mM2.size())));
      }
    }
    return mM2.get(n);
  }

  private int n(final int s) {
    int n = 0;
    while (m2(n).intValueExact() <= s) {
      ++n;
    }
    return n - 1;
  }

  @Override
  public Z next() {
    final int n = n(++mS);
    Z sum = Z.valueOf(n).multiply(mS - m2(n).intValueExact());
    for (int h = 1; h <= n; ++h) {
      sum = sum.add(n2(h).multiply(h - 1));
    }
    return sum;
  }
}
