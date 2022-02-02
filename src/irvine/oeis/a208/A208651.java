package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208651 Number of paths through the subset array whose trace is a permutation of (1,2,...,n); see Comments.
 * @author Georg Fischer
 */
public class A208651 implements Sequence {

  private Z mFact = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    return Integers.SINGLETON.product(1, mN - 1, k -> Binomial.binomial(mN - 1, k)).multiply(mFact);
  }
}
