package irvine.oeis.a130;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A130139 Let f denote the map that replaces k with the concatenation of its nontrivial divisors, written in increasing order, each divisor being written in base 10 in the normal way. Then a(n) = prime reached when starting at 2n+1 and iterating f.
 * @author Sean A. Irvine
 */
public class A130139 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z t = Z.valueOf(2 * mN + 1);
    while (!t.isProbablePrime()) {
      t = FactorUtils.concatenateDivisors(t);
    }
    return t;
  }
}
