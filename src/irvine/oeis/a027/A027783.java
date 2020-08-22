package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027783 a(n) = 5*(n+1)*binomial(n+2,10).
 * @author Sean A. Irvine
 */
public class A027783 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 1, 10).multiply(5 * mN);
  }
}
