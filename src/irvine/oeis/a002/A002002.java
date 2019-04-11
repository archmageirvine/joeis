package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002002 <code>a(n) =</code> Sum_{k=0..n-1} binomial(n,k+1) * binomial(n+k,k).
 * @author Sean A. Irvine
 */
public class A002002 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k + 1).multiply(Binomial.binomial(mN + k, k)));
    }
    return s;
  }
}
