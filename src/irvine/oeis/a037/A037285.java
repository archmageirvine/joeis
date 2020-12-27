package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037285.
 * @author Sean A. Irvine
 */
public class A037285 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final Z dd : Cheetah.factor(++mN).divisorsSorted()) {
      final long d = dd.longValue();
      if (d != 1 && d != mN && (d & 1) == 1) {
        sb.append(d);
      }
    }
    return sb.length() == 0 ? Z.ZERO : new Z(sb);
  }
}

