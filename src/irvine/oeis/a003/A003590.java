package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003590.
 * @author Sean A. Irvine
 */
public class A003590 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= mN; ++k) {
      sb.append(Binomial.binomial(mN, k));
    }
    return new Z(sb.toString());
  }
}
