package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051889 a(n) = min{m: Sum_{j=0..m} binomial(n,j)*(1/6)^j*(1-1/6)^(n-i) &gt;= 0.95}.
 * @author Sean A. Irvine
 */
public class A051889 extends Sequence0 {

  private static final Q LIMIT = new Q(95, 100);
  private static final Q OS = new Q(1, 6);
  private static final Q FS = new Q(5, 6);
  private int mN = -1;

  @Override
  public Z next() {
    long m = -1;
    Q t = FS.pow(++mN);
    Q sum = Q.ZERO;
    while (sum.compareTo(LIMIT) < 0) {
      sum = sum.add(t.multiply(Binomial.binomial(mN, ++m)));
      t = t.multiply(OS).divide(FS);
    }
    return Z.valueOf(m);
  }
}
