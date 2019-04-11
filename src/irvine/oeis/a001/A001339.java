package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001339 <code>a(n) =</code> Sum_{k=0..n} (k+1)! binomial(n,k).
 * @author Sean A. Irvine
 */
public class A001339 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      f = f.multiply(k + 1);
      s = s.add(f.multiply(Binomial.binomial(mN, k)));
    }
    return s;
  }
}
