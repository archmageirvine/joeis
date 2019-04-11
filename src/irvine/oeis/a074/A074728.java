package irvine.oeis.a074;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074728 <code>a(n) =</code> Sum_{k=1..n} k^(n-k)*binomial(n,k-1).
 * @author Sean A. Irvine
 */
public class A074728 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(Z.valueOf(k).pow(mN - k).multiply(Binomial.binomial(mN, k - 1)));
    }
    return s;
  }

}
