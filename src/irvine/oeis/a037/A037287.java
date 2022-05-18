package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037287 Replace 2n+1 with concatenation of its divisors &gt;1.
 * @author Sean A. Irvine
 */
public class A037287 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (!Z.ONE.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }
}

