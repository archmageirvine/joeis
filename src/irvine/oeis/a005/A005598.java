package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005598 <code>a(n) = 1 +</code> Sum_{i=1..n} (n-i+1)*phi(i).
 * @author Sean A. Irvine
 */
public class A005598 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN - k + 1).multiply(LongUtils.phi(k)));
    }
    return sum;
  }
}

