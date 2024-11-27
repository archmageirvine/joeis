package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A050320 Number of ways n is a product of squarefree numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050320 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence squarefree = new A005117().skip(1);
    Ds series = Dgf.one();
    long s;
    while ((s = squarefree.next().intValueExact()) <= mN) {
      series = Dgf.multiply(series, Dgf.zetap(s));
    }
    return series.coeff(mN);
  }
}
