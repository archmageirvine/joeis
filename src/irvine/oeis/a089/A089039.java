package irvine.oeis.a089;
// manually hygeom at 2022-08-04 18:08

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089039 Number of circular permutations of 2n letters that are free of jealousy.
 * <code>a(1)=1, a(n) = Sum_{k=1..floor(n/2)} n!*(n-k-1)!^2/((k-1)!^2*(n-2*k)!*k)</code> for n &gt; 1
 * @author Georg Fischer
 */
public class A089039 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    } else {
      Q sum = Q.ZERO;
      for (int k = 1; k <= mN / 2; ++k) {
        sum = sum.add(Functions.FACTORIAL.z(mN)
          .multiply(Functions.FACTORIAL.z(mN - k - 1).square())
          .divide(Functions.FACTORIAL.z(k - 1).square())
          .divide(Functions.FACTORIAL.z(mN - 2 * k))
          .divide(k));
      }
      return sum.num();
    }
  }
}
