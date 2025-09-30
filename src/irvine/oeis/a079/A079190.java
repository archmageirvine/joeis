package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a001.A001329;

/**
 * A079190 Number of isomorphism classes of anti-commutative closed binary operations (groupoids) on a set of order n.
 * @author Sean A. Irvine
 */
public class A079190 extends A001329 {

  /** Construct the sequence. */
  public A079190() {
    super(1);
  }

  @Override
  protected int start() {
    return 0;
  }

  private Z even(final int[] s, final int i) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(i).divisors()) {
      final int d = dd.intValue();
      if (((i / d) & 1) == 1) {
        sum = sum.add(Z.valueOf((long) d * s[d]));
      }
    }
    return sum.pow(s[i]);
  }

  private Z innerSum(final int[] s, final int i, final int j) {
    if (i == j) {
      final Z sd = Integers.SINGLETON.sumdiv(i, d -> Z.valueOf((long) s[d] * d));
      if ((i & 1) == 1) {
        final Z u = sd.pow(s[i] * ((long) i * s[i] + 1) / 2);
        final Z v = sd.subtract(1).pow(s[i] * ((long) i * s[i] - 1) / 2);
        return u.multiply(v);
      } else {
        final Z u = even(s, i);
        final Z v = sd.pow((long) i * s[i] * s[i] / 2);
        final Z w = sd.subtract(1).pow(s[i] * ((long) i * s[i] - 2) / 2);
        return u.multiply(v).multiply(w);
      }
    } else if (i < j) {
      final Z sd = Integers.SINGLETON.sumdiv(Functions.LCM.i(i, j), d -> d < s.length ? Z.valueOf((long) s[d] * d) : Z.ZERO);
      return sd.pow((long) Functions.GCD.i(i, j) * s[i] * s[j]);
    } else {
      final Z sd = Integers.SINGLETON.sumdiv(Functions.LCM.i(i, j), d -> d < s.length ? Z.valueOf((long) s[d] * d) : Z.ZERO);
      return sd.subtract(1).pow((long) Functions.GCD.i(i, j) * s[i] * s[j]);
    }
  }

  @Override
  protected Z fix(final int[] s) {
    Z prod = Z.ONE;
    for (int j = 1; j < s.length; ++j) {
      for (int i = 1; i < s.length; ++i) {
        prod = prod.multiply(innerSum(s, i, j));
      }
    }
    return prod;
  }
}
