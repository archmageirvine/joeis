package irvine.oeis.a115;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115101 Number of distinct prime factors of L(n + F(n)) where F(n) is the Fibonacci number and L(n) is the Lucas number and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A115101 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.OMEGA.z(Functions.LUCAS.z(Functions.FIBONACCI.l(mN) + mN));
  }
}

