package irvine.oeis.a120;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A120716 a(1)=1, a(p)=p if p is a prime. Otherwise, start with n and iterate the map (k -&gt; concatenation of nontrivial divisors of k) until we reach a prime q; then a(n) = q. If we never reach a prime, a(n) = -1.
 * @author Sean A. Irvine
 */
public class A120716 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z t = Z.valueOf(mN);
    while (!t.isProbablePrime()) {
      t = FactorUtils.concatenateDivisors(t);
    }
    return t;
  }
}
