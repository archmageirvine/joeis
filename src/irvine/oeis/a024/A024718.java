package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024718 <code>a(n) = (1/2)*(1 +</code> sum of <code>C(2k,k))</code> for k <code>= 0,1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024718 implements Sequence {

  private Z mSum = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(2 * ++mN, mN));
    return mSum.divide2();
  }
}
