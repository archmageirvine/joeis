package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A051119 a(n) = n/p^k, where p = largest prime dividing n and p^k = highest power of p dividing n.
 * @author Sean A. Irvine
 */
public class A051119 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] p = fs.toZArray();
    return n.divide(p[p.length - 1].pow(fs.getExponent(p[p.length - 1])));
  }

  @Override
  public Z a(final int n) {
    if (n == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] p = fs.toZArray();
    return Z.valueOf(n).divide(p[p.length - 1].pow(fs.getExponent(p[p.length - 1])));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
