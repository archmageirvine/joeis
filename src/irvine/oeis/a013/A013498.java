package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013498 Number of permutations in S_n with a certain property.
 * @author Sean A. Irvine
 */
public class A013498 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    return Binomial.binomial(mN - 2, mN / 2 - 1).add(Binomial.binomial(mN - 3, mN / 2 - 2).multiply((mN - 1) / 2));
  }
}
