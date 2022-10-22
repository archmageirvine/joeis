package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A071969 a(n) = Sum_{k=0..floor(n/3)} (binomial(n+1, k)*binomial(2*n-3*k, n-3*k)/(n+1)).
 * @author Georg Fischer
 */
public class A071969 implements SequenceWithOffset {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 3, k -> Binomial.binomial(mN + 1, k)
      .multiply(Binomial.binomial(2 * mN - 3 * k, mN - 3 * k)).divide(mN + 1));
  }
}
