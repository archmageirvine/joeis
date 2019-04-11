package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002790 Denominators of Cauchy numbers of second type <code>(=</code> Bernoulli numbers B_n^{(n)}).
 * @author Sean A. Irvine
 */
public class A002790 implements Sequence {

  int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd((k & 1) == 0, new Q(Stirling.firstKind(mN, k), Z.valueOf(k + 1)));
    }
    return s.den();
  }
}
