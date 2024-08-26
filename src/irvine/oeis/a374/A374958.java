package irvine.oeis.a374;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A374958 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long x = ++mN;
    Q sum = Q.ZERO;
    while (true) {
      sum = sum.add(new Q(Functions.STIRLING1.z(x - 1, mN - 1).abs(), Functions.FACTORIAL.z(x)));
      if (sum.compareTo(Q.HALF) >= 0) {
        return Z.valueOf(x);
      }
      ++x;
    }
  }
}
