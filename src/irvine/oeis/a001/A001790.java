package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001790 Numerators in expansion of 1/sqrt(1-x).
 * @author Sean A. Irvine
 */
public class A001790 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return new Q(Binomial.binomial(2 * ++mN, mN), Z.ONE.shiftLeft(2 * mN)).num();
  }
}
