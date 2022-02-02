package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208649 (1/n)*A073617(n+1).
 * @author Georg Fischer
 */
public class A208649 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, (mN + 1) / 2, k -> Binomial.binomial(mN + 1 - k, k)).divide(mN);
  }
}
