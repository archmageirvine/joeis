package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006918 a(n) = binomial(n+3, 3)/4, n odd; n(n+2)(n+4)/24, n even.
 * @author Sean A. Irvine
 */
public class A006918 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).multiply(mN + 2).multiply(mN + 4).divide(24)
      : Binomial.binomial(mN + 3, 3).divide(4);
  }
}
