package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A037278 Replace n with concatenation of its divisors.
 * @author Sean A. Irvine
 */
public class A037278 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }

  @Override
  public Z a(final int n) {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }

}

