package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007946 a(n) = 6*(2*n+1)! / ((n!)^2*(n+3)).
 * @author Sean A. Irvine
 */
public class A007946 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 2, mN).add(Binomial.binomial(2 * mN + 3, mN));
  }
}
