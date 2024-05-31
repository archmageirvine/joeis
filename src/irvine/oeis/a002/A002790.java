package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002790 Denominators of Cauchy numbers of second type (= Bernoulli numbers B_n^{(n)}).
 * @author Sean A. Irvine
 */
public class A002790 extends Sequence0 {

  int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd((k & 1) == 0, new Q(Functions.STIRLING1.z(mN, k), Z.valueOf(k + 1)));
    }
    return s.den();
  }
}
