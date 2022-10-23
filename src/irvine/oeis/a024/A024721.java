package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024721 a(n) = (1/5)*(4 + sum of C(5k,k)) for k = 0,1,2,...,n.
 * @author Sean A. Irvine
 */
public class A024721 extends Sequence0 {

  private Z mSum = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(5 * ++mN, mN));
    return mSum.divide(5);
  }
}
