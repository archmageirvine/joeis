package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000846 a(n) = C(3n,n) - C(2n,n).
 * @author Sean A. Irvine
 */
public class A000846 extends Sequence0 {

  private int mN = -1;
  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3L * mN, mN).subtract(Binomial.binomial(2L * mN, mN));
  }
}

