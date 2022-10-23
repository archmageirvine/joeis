package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002657 Numerators of Cauchy numbers of second type (= Bernoulli numbers B_n^{(n)}).
 * @author Sean A. Irvine
 */
public class A002657 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.signedAdd(((mN - k) & 1) == 0, new Q(Stirling.firstKind(mN, k), Z.valueOf(k + 1)));
    }
    return s.num();
  }
}
