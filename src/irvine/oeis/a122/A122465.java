package irvine.oeis.a122;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122465 a(n) is the smallest number k such that gpf(k-j) &lt;= floor((k-j)^(1/n)) for 0&lt;=j&lt;=3 where gpf(k) is the greatest prime factor of k.
 * @author Sean A. Irvine
 */
public class A122465 extends Sequence1 {

  private int mN = 0;

  private boolean is(final long k) {
    return Functions.GPF.z(k).compareTo(Z.valueOf(k).root(mN)) <= 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 4;
    while (true) {
      ++k;
      if (!is(k)) {
        k += 3;
      } else if (!is(k - 1)) {
        k += 2;
      } else if (!is(k - 2)) {
        ++k;
      } else if (is(k - 3)) {
        return Z.valueOf(k);
      }
    }
  }
}
