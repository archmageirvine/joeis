package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001089 Number of permutations of <code>[n]</code> containing exactly 2 increasing subsequences of length 3.
 * @author Sean A. Irvine
 */
public class A001089 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    return Binomial.binomial(2 * mN, mN - 4)
      .multiply(n.square().multiply(59).add(n.multiply(117)).add(100))
      .divide2()
      .divide(mN)
      .divide(mN + 5)
      .divide(2 * mN - 1);
  }
}

