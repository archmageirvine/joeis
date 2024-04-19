package irvine.oeis.a014;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a050.A050255;

/**
 * A014088 Minimal number of people to give a 50% probability of having at least n coincident birthdays in one year.
 * @author Sean A. Irvine
 */
public class A014088 extends A050255 {

  // After Jean-Francois Alcover
  // todo this seems stupidly slow ... even with A050255 giving a starting point

  private static final class QFunction extends MemoryFunctionInt3<Q> {

    private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

    @Override
    protected Q compute(final int k, final int n, final int d) {
      if (k == 1) {
        return new Q(Functions.FACTORIAL.z(d), Functions.FACTORIAL.z(d - n).multiply(Z.valueOf(d).pow(n)));
      }
      Q sum = Q.ZERO;
      for (int i = 1; i < n / k; ++i) {
        Q s = Q.ZERO;
        for (int j = 1; j < k; ++j) {
          s = s.add(get(j, n - i * k, d - i));
        }
        s = s.multiply(Z.valueOf(d - i).pow(n - (long) i * k))
          .divide(Z.valueOf(d).pow(n - i * (long) k))
          .divide(Functions.FACTORIAL.z(i).multiply(Z.valueOf(d).pow(i * (long) k).multiply(Functions.FACTORIAL.z(k).pow(i)).multiply(Functions.FACTORIAL.z(n - i * k)).multiply(Functions.FACTORIAL.z(d - i))));
        sum = sum.add(s);
      }
      return sum.multiply(Functions.FACTORIAL.z(n).multiply(Functions.FACTORIAL.z(d)));
    }

    private Q p(final int k, final Z n, final int d) {
      Q res = Q.ONE;
      for (int j = 1; j < k; ++j) {
        res = res.subtract(get(j, n.intValueExact(), d));
      }
      return res;
    }
  }

  private final QFunction mQ = new QFunction();
  private int mN = 0;

  @Override
  public Z next() {
    Z a = super.next();
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      if (mQ.p(mN, a, 365).compareTo(Q.HALF) >= 0) {
        return a;
      }
      a = a.add(1);
    }
  }

}

