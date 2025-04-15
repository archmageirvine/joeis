package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076745 a(n) = the least positive integer k such that b(k) = n, where b(k) (A076526) is defined by b(k) = r * max{e_1,...,e_r} if k = p_1^e_1 *...* p_r^e_r is the canonical prime factorization of k.
 * @author Sean A. Irvine
 */
public class A076745 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z min = null;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      final Z t = Integers.SINGLETON.product(1, mN / d - 1, k -> Functions.PRIME.z(k + 1)).shiftLeft(d);
      if (min == null || t.compareTo(min) < 0) {
        min = t;
      }
    }
    return min;
  }
}
