package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052468 Numerators in the Taylor series for arccosh(x) - log(2*x).
 * @author Sean A. Irvine
 */
public class A052468 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Q(Binomial.binomial(2L * ++mN, mN), Z.valueOf(mN).shiftLeft(2 * mN - 1)).num();
  }
}
