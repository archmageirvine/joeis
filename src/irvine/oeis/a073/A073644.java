package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073644 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    long k = -1;
    while (true) {
      ++k;
      sum = sum.add(new Q(1, Functions.PHI.l(mN + k)));
      if (!sum.reciprocal().multiply(k + 1).isInteger()) {
        return Z.valueOf(k - 1);
      }
    }
  }
}
