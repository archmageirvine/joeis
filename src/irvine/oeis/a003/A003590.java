package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003590 Rows of Pascal's triangle written as a single number.
 * @author Sean A. Irvine
 */
public class A003590 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= mN; ++k) {
      sb.append(Binomial.binomial(mN, k));
    }
    return new Z(sb);
  }
}
