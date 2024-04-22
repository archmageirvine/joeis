package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054783 (n^2)-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A054783 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final long n = (long) ++mN * mN;
    return Functions.FIBONACCI.z(n);
  }
}
