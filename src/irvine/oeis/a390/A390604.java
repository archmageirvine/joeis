package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390604 a(n) is the number of ways n^n can be written as s^t*u^v, where s, t, u, v are integers &gt; 1 and s^t &lt;= u^v.
 * @author Sean A. Irvine
 */
public class A390604 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private int e(final Z x) {
    final FactorSequence fs = Jaguar.factor(x);
    int gcd = fs.minExponent();
    if (gcd > 1) {
      for (final Z p : fs.toZArray()) {
        gcd = Functions.GCD.i(gcd, fs.getExponent(p));
      }
    }
    return gcd;
  }

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(new FactorSequence(++mN).pow(mN)).divisorsSorted();
    Z a = Z.ZERO;
    for (int k = 1; 2 * k < d.length - 1; ++k) {
      final int g = e(d[k]);
      final int t = e(d[d.length - 1 - k]);
      a = a.add(Functions.SIGMA0.z(g).subtract(1).multiply(Functions.SIGMA0.z(t).subtract(1)));
    }
    if ((mN & 1) == 0) {
      final Z b = Functions.SIGMA0.z(e(d[d.length / 2])).subtract(1);
      a = a.add(b.multiply(b.add(1)).divide2());
    }
    return a;
  }
}
