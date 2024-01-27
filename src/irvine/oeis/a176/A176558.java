package irvine.oeis.a176;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A176558 Replace n with the reverse concatenation of divisors of n.
 * @author Sean A. Irvine
 */
public class A176558 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      sb.insert(0, d.toString());
    }
    return new Z(sb);
  }
}
