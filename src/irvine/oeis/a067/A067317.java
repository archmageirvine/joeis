package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067317 Numbers k such that 1 + binomial(k,j) is prime for only 2 values of j (0 &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A067317 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long cnt = 0;
      for (long k = 0; 2 * k <= mN; ++k) {
        if (Binomial.binomial(mN, k).add(1).isProbablePrime()) {
          cnt += 2 * k == mN ? 1 : 2;
          if (cnt > 2) {
            break;
          }
        }
      }
      if (cnt == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

