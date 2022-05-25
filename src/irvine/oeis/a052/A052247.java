package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a031.A031924;

/**
 * A052247 Maximal value of smallest prime divisors of the 5 composite numbers between A031924(n) and A031925(n).
 * @author Sean A. Irvine
 */
public class A052247 extends A031924 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z max = Z.ONE;
    for (int k = 1; k < 6; ++k) {
      max = max.max(Jaguar.factor(p.add(k)).leastPrimeFactor());
    }
    return max;
  }
}

