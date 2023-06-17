package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006918 a(n) = binomial(n+3, 3)/4 for odd n, n*(n+2)*(n+4)/24 for even n.
 * @author Sean A. Irvine
 */
public class A006918 extends AbstractSequence {

  /* Construct the sequence. */
  public A006918() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).multiply(mN + 2).multiply(mN + 4).divide(24)
      : Binomial.binomial(mN + 3, 3).divide(4);
  }
}
