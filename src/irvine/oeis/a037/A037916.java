package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037916 Concatenate exponents in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A037916 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Cheetah.factor(mN);
    for (final Z p : fs.toZArray()) {
      sb.append(fs.getExponent(p));
    }
    return new Z(sb);
  }
}
