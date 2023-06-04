package irvine.oeis.a106;
// manually binomx at 2023-06-01 10:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A106391 A "cosh transform" of binomial(2n,n-1).
 * @author Georg Fischer
 */
public class A106391 extends Sequence0 {

  private int mN = -1;

  @Override
  // A106491 := proc(n) add(binomial(n, 2*k)*binomial(2*(n-2*k), n-2*k+1), k=0..floor(n/2)) ;
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 2, k -> Binomial.binomial(mN, 2 * k).multiply(Binomial.binomial(2 * (mN - 2 * k), mN - 2 * k + 1)));
  }
}
