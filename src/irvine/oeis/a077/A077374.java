package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077374 Odd numbers whose abundance b satisfies -10 &lt;= b &lt;= 10, where the abundance of a number n is A(n) = sigma(n) - 2n.
 * @author Sean A. Irvine
 */
public class A077374 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SIGMA1.z(mN).subtract(2 * mN).abs().compareTo(Z.TEN) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
