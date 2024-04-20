package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060385 Largest prime factor of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A060385 extends A000045 {

  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
