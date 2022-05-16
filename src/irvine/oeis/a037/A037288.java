package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037288 Replace 2n+1 with concatenation of its nontrivial divisors.
 * @author Sean A. Irvine
 */
public class A037288 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final StringBuilder sb = new StringBuilder();
    for (final Z dd : Jaguar.factor(mN).divisorsSorted()) {
      final long d = dd.longValue();
      if (d != 1 && d != mN) {
        sb.append(d);
      }
    }
    return sb.length() == 0 ? Z.ZERO : new Z(sb);
  }
}

