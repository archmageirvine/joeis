package irvine.oeis.a180;
// manually hygeom at 2022-08-06 15:16

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A180966 Hankel transform of A123164.
 * 2^C(n, 2)*Sum_{k=0..floor(n/2)} C(n-k,k)*(-2)^k*4^(n-2*k).
 * @author Georg Fischer
 */
public class A180966 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : Z.ONE.shiftLeft(((mN - 1) * mN) / 2).multiply(Integers.SINGLETON.sum(0, mN / 2, k -> Binomial.binomial(mN - k, k)
      .multiply(Z.valueOf(-2).pow(k))
      .multiply(Z.FOUR.pow(mN - 2 * k))
    ));
  }
}
