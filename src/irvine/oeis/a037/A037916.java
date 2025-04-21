package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A037916 Concatenate exponents in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A037916 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      sb.append(fs.getExponent(p));
    }
    return new Z(sb);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
