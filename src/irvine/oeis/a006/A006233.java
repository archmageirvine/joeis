package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006233 Denominators of Cauchy numbers of first type.
 * @author Sean A. Irvine
 */
public class A006233 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Stirling.firstKind(mN, k), Z.valueOf(k + 1)));
    }
    return sum.den();
  }
}
