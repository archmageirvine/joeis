package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.a014.A014688;

/**
 * A167136 a(n) = b(n)-th highest positive integer not equal to any a(k), 1 &lt;= k &lt;= n-1, where b(n) = noncomposite numbers = A008578(n).
 * @author Georg Fischer
 */
public class A167136 extends A014688 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
