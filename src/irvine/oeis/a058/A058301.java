package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002083;

/**
 * A058301 Number of solutions to c(0)F(0)+...+c(n)F(n) = 0, where c(i) = +-1 for i&gt;=0, number of (+1)'s &gt;= number of (-1)'s, F(i) = A000045(i) = Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A058301 extends A002083 {

  private int mN = -1;
  private int mM = -1;
  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (++mN % 3 == 1) {
      return Z.ZERO;
    }
    final long r = mN % 6;
    return r == 0 || r == 2 ? Z.ONE.shiftLeft(++mM) : super.next();
  }
}
