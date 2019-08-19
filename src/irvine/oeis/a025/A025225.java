package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025225 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1)</code> for <code>n &gt;= 2</code>. Also <code>a(n) = (2^n)*C(n-1)</code>, where C <code>= A000108</code> (Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025225 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2L * ++mN - 2, mN - 1).shiftLeft(mN).divide(mN);
  }
}
