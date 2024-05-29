package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069954 a(n) = binomial(2^(n+1), 2^n)/2 = binomial(2^(n+1) - 1, 2^n) = binomial(2^(n+1) - 1, 2^n-1).
 * @author Sean A. Irvine
 */
public class A069954 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(Z.ONE.shiftLeft(++mN + 1), Z.ONE.shiftLeft(mN)).divide2();
  }
}
