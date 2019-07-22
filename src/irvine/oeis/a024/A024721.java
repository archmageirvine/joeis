package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024721 <code>a(n) = (1/5)*(4 +</code> sum of <code>C(5k,k))</code> for k <code>= 0,1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024721 implements Sequence {

  private Z mSum = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(5 * ++mN, mN));
    return mSum.divide(5);
  }
}
