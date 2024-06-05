package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061249 Smallest number with digit sum = Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A061249 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z f = Functions.FIBONACCI.z(++mN);
    final Z f9 = f.divide(9);
    return f.add(1).subtract(f9.multiply(9)).multiply(Z.TEN.pow(f9)).subtract(1);
  }
}
