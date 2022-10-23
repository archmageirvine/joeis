package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037279 If n is composite, replace n with the concatenation of its proper divisors, otherwise a(n) = n.
 * @author Sean A. Irvine
 */
public class A037279 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN) || mN.isProbablePrime()) {
      return mN;
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

