package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006943 Rows of Sierpi&#324;ski's triangle (Pascal's triangle <code>mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A006943 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder(mN + 1);
    for (long k = 0; k <= mN; ++k) {
      sb.append(Binomial.binomial(mN, k, 2));
    }
    return new Z(sb);
  }
}
