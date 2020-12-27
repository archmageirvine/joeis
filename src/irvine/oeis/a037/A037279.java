package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037279.
 * @author Sean A. Irvine
 */
public class A037279 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN) || mN.isProbablePrime()) {
      return mN;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(mN).divisorsSorted()) {
      if (!Z.ONE.equals(d) && !mN.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}

