package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079823 Consider the triangle shown below; sequence contains the concatenation of numbers read at a 45-degree angle upwards with horizontal beginning with the first term of a row.
 * @author Sean A. Irvine
 */
public class A079823 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      sb.append(Binomial.binomial(mN - k + 1, 2).add(k));
    }
    return new Z(sb);
  }
}

