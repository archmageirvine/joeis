package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071818 Triangle of T(n,k) where T(n,k)/(n-1)! is probability of player k out of n players winning a game of "Elimination": rules are that player 1 chooses one of the others at random to be eliminated, then player 2 (or 3 if player 2 has been eliminated) chooses somebody else at random from the survivors to be eliminated next, then the next surviving player chooses and so on round the circle until all but one have been eliminated.
 * @author Sean A. Irvine
 */
public class A071818 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return n == 1 ? Z.ONE : get(n - 1, n - 1).multiply(n - 1);
      }
      if (m == 0) {
        return Z.ZERO;
      }
      return get(n - 1, m - 2).multiply(m - 2).add(get(n - 1, m - 1).multiply(n - m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
