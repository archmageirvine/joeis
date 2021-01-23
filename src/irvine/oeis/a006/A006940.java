package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006940 Rows of Pascal's triangle mod 3.
 * @author Sean A. Irvine
 */
public class A006940 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder(mN + 1);
    for (long k = 0; k <= mN; ++k) {
      sb.append(Binomial.binomial(mN, k, 3));
    }
    return new Z(sb);
  }
}
