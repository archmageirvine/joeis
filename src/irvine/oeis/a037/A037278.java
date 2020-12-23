package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037278 Replace n with concatenation of its divisors.
 * @author Sean A. Irvine
 */
public class A037278 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(++mN).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }
}

