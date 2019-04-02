package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000913 Number of bond-rooted polyenoids with n edges.
 * @author Sean A. Irvine
 */
public class A000913 implements Sequence {

  private int mN = 0;

  private Z c(final int n) {
    return Binomial.binomial(2L * n, n).divide(n + 1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z a = (mN & 1) == 0 ? Z.ZERO : c((mN + 1) / 2).multiply(3);
    final Z b = (mN & 3) != 1 ? Z.ZERO : c(mN / 4).multiply2();
    return c(mN + 2).subtract(c(mN + 1).multiply2()).subtract(a).add(b).divide(4);
  }
}

