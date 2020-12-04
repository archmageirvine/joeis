package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036973 (7*n^3+4*n^2+4*n)*binomial(2*n,n)/30.
 * @author Sean A. Irvine
 */
public class A036973 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.SEVEN.multiply(++mN).add(4).multiply(mN).add(4).multiply(mN)
      .multiply(Binomial.binomial(2 * mN, mN)).divide(30);
  }
}

