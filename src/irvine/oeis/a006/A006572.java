package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a111.A111999;

/**
 * A006572 Numerators of an asymptotic expansion for the number of forests on n nodes (A001858).
 * @author Sean A. Irvine
 */
public class A006572 extends A111999 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      final Q v = new Q(get((long) mN, 2L * k - 1).abs(), mF.factorial(mN - k).shiftLeft(mN - k));
      sum = sum.signedAdd((k & 1) != 0, v);
      //System.out.println(mN + " k= " + k + " adding " + v + " sum now: " + sum);
    }
    return select(sum);
  }
}
