package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005810 a(n) = binomial(4n,n).
 * @author Sean A. Irvine
 */
public class A005810 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN);
  }
}
