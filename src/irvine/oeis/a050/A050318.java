package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A050318 a(n) is the number of ways to write n as an mterm, where an mterm is an unordered sum which is either 2, or 1 + an unordered product of mterms.
 * @author Sean A. Irvine
 */
public class A050318 extends MemorySequence {

  {
    setOffset(2);
    add(null); // 0
    add(null); // 1
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    Ds series = Dgf.one();
    for (int k = 2; k < n; ++k) {
      series = Dgf.multiply(series, Dgf.pow(Dgf.zetap(k), a(k)));
    }
    return series.coeff(n - 1);
  }
}
