package irvine.oeis.a381;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A381054 a(n) is the least k such that floor(sqrt(n*k/d(n*k))) - floor(sqrt(d(n*k))) = 1, where d(k) is the largest divisor of k which is &lt;= sqrt(k).
 * @author Sean A. Irvine
 */
public class A381054 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  private Z d(final Z n) {
    final Z[] divs = Jaguar.factor(n).divisorsSorted();
    for (int k = divs.length - 1; true; --k) {
      if (divs[k].square().compareTo(n) <= 0) {
        return divs[k];
      }
    }
  }

  @Override
  public Z a(final Z n) {
    long k = 0;
    while (true) {
      final Z nk = n.multiply(++k);
      final Z dnk = d(nk);
      if (nk.divide(dnk).sqrt().subtract(dnk.sqrt()).isOne()) {
        return Z.valueOf(k);
      }
    }
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
