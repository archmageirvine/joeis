package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060001 a(n) = Fibonacci(n)!.
 * @author Sean A. Irvine
 */
public class A060001 extends A000045 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
