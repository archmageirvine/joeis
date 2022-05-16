package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037286 Replace 2n+1 with concatenation of its divisors.
 * @author Sean A. Irvine
 */
public class A037286 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }
}

