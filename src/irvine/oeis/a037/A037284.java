package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037284 Replace n with concatenation of its odd divisors &gt;1.
 * @author Sean A. Irvine
 */
public class A037284 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(++mN).divisorsSorted()) {
      if (!d.isEven() && !Z.ONE.equals(d)) {
        sb.append(d);
      }
    }
    return sb.length() == 0 ? Z.ZERO : new Z(sb);
  }
}

