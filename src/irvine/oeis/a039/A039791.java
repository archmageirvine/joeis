package irvine.oeis.a039;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039791.
 * @author Sean A. Irvine
 */
public class A039791 extends Sequence1 {

  // After Travis Scott

  private static final MultivariatePolynomial<Q> A_PLUS_B = new MultivariatePolynomial<>(Rationals.SINGLETON, 2, new int[][]{{0, 1}, {1, 0}}, Arrays.asList(Q.ONE, Q.ONE));
  private int mN = 0;

  private int order(final int g, final int k) {
    if (k == 1) {
      return g;
    }
    final int m = Functions.ORDER.i(g, k);
    return g / Z.valueOf(g).gcd(Z.valueOf(k).pow(m).subtract(1).divide(k - 1)).intValueExact() * m;
  }

  private MultivariateMonomial cycleIndex(final int l, final int k, final int j) {
    final Map<Integer, Q> monomial = new HashMap<>();
    for (int i = 1; i <= l; ++i) {
      final int g = l / IntegerUtils.gcd(l, (k - 1) * i + j);
      final int v = order(g, k);
      monomial.merge(v, new Q(1, v), Q::add);
    }
    final MultivariateMonomial m = new MultivariateMonomial();
    for (final Map.Entry<Integer, Q> e : monomial.entrySet()) {
      m.add(e.getKey(), e.getValue().toZ().longValueExact());
    }
    return m;
  }

  private CycleIndex cycleIndex(final int l, final int k) {
    final CycleIndex ci = new CycleIndex();
    final int d = IntegerUtils.gcd(l, k - 1);
    for (int j = 1; j <= d; ++j) {
      ci.add(cycleIndex(l, k, j));
    }
    ci.multiply(new Q(l / d));
    return ci;
  }

  private CycleIndex cycleIndex(final int l) {
    final CycleIndex ci = new CycleIndex();
    for (int k = 1; k <= l; ++k) {
      if (IntegerUtils.gcd(k, l) == 1) {
        ci.add(cycleIndex(l, k));
      }
    }
    ci.multiply(new Q(Z.ONE, Functions.PHI.z(l).multiply(l)));
    return ci;
  }

  @Override
  public Z next() {
    final CycleIndex ci = cycleIndex(2 * ++mN + 1);
    final MultivariatePolynomial<Q> p = ci.apply(A_PLUS_B, new int[] {mN + 1, mN + 2});
    //System.out.println(mN + " " + p);
    return p.extract(0, mN).toPolynomial().coeff(mN + 1).toZ();
  }
}

