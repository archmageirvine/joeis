package irvine.oeis.a090;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A090889 Double partial sums of (n * its dyadic valuation).
 * @author Georg Fischer
 */
public class A090889 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(n)=sum(k=1, n, bitand(k, n-k)+k*(n-k))
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Z.valueOf((k & mN - k) + k * (mN - k)));
  }
}
