package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006232 Numerators of Cauchy numbers of first type.
 * @author Sean A. Irvine
 */
public class A006232 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Functions.STIRLING1.z(mN, k), Z.valueOf(k + 1)));
    }
    return sum.num();
  }
}
