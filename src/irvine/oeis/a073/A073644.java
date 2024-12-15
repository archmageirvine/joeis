package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073644 Largest k such that the harmonic mean of phi(n), phi(n+1), ...., phi(n+x) is an integer for any x with 0&lt;=x&lt;=k.
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
