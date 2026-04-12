package irvine.oeis.a394;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394762 Minimum number of draws without replacement from an urn with n white and n black balls to ensure the probability of drawing at least one ball of each color is &gt;= n/(n+1).
 * @author Sean A. Irvine
 */
public class A394762 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Binomial.binomial(mN, ++k).multiply(mN + 1).multiply2().compareTo(Binomial.binomial(2 * mN, k)) <= 0) {
        return Z.valueOf(k);
      }
    }
  }
}
