package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060383 a(1) = a(2) = 1; for n &gt;2, a(n) = smallest prime factor of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A060383 extends A000045 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
