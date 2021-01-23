package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037277 Replace n with concatenation of its divisors &gt;1.
 * @author Sean A. Irvine
 */
public class A037277 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(mN).divisorsSorted()) {
      if (!Z.ONE.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}

