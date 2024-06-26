package irvine.oeis.a202;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A202950 a(n) = Sum_{k=0..n} (2*n-k)!*2^(k-n)/k!.
 * @author Georg Fischer
 */
public class A202950 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Functions.FACTORIAL.z(2 * mN - k),
        Functions.FACTORIAL.z(k).multiply(Z.ONE.shiftLeft(mN - k))));
    }
    return sum.num();
  }
}
