package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025225 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1) for n &gt;= 2. Also a(n) = (2^n)*C(n-1), where C = A000108 (Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025225 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2L * ++mN - 2, mN - 1).shiftLeft(mN).divide(mN);
  }
}
