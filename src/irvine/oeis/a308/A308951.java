package irvine.oeis.a308;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308951 Number of principal reversible magic squares of order 4n.
 * @author Sean A. Irvine
 */
public class A308951 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(4 * mN);
    final Z[] w = new Z[(int) (fs.bigOmega() + 1)];
    for (int v = 0; v < w.length; ++v) {
      Z sum = Z.ZERO;
      for (int i = 0; i < v; ++i) {
        Z term = Z.ONE;
        for (final Z g : fs.toZArray()) {
          term = term.multiply(Binomial.binomial(fs.getExponent(g) + i, i));
        }
        sum = sum.signedAdd(((v + i + 1) & 1) == 0, Binomial.binomial(v, i + 1).multiply(term));
      }
      w[v] = sum;
    }
    Z sum = Z.ZERO;
    for (int v = 1; v < w.length; ++v) {
      sum = sum.add(w[v].multiply(w[v].add(w[v - 1])));
    }
    return sum;
  }
}
