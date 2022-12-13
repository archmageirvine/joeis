package irvine.oeis.a106;
// manually anopan 1,1

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A106708 a(n) is the concatenation of its nontrivial divisors.
 * @author Georg Fischer
 */
public class A106708 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN) || mN.isProbablePrime()) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (!Z.ONE.equals(d) && !mN.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}
