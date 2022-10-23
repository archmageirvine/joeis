package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025174 a(n) = binomial(3n-1, n-1).
 * @author Sean A. Irvine
 */
public class A025174 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Binomial.binomial(3 * mN - 1, mN - 1);
  }
}
