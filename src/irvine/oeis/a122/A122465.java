package irvine.oeis.a122;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122465 Smooth Power Quartets: The m-th number in the sequence, n, is part of the minimum quartet of numbers n through n-3 such that the highest prime factor of each number x &lt;= floor(x^(1/m)).
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
