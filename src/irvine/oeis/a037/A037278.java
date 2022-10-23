package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037278 Replace n with concatenation of its divisors.
 * @author Sean A. Irvine
 */
public class A037278 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }
}

