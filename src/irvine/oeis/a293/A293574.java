package irvine.oeis.a293;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A293574 a(n) = Sum_{k=0..n} n^(n-k)*binomial(n+k-1,k).
 * @author Georg Fischer
 */
public class A293574 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Z.valueOf(mN).pow(mN - k).multiply(Binomial.binomial(mN + k - 1, k)));
  }
}
