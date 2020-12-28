package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037283 Replace n with concatenation of its odd divisors.
 * @author Sean A. Irvine
 */
public class A037283 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(++mN).divisorsSorted()) {
      if (!d.isEven()) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}

