package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077374 Odd numbers m whose abundance by absolute value is at most 10, that is, -10 &lt;= sigma(m) - 2m &lt;= 10.
 * @author Sean A. Irvine
 */
public class A077374 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SIGMA1.z(mN).subtract(2 * mN).compareAbs(Z.TEN) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
