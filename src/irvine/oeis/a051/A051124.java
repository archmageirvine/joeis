package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A051124 a(n) = Fibonacci(n) XOR Fibonacci(n+1).
 * @author Sean A. Irvine
 */
public class A051124 extends A000045 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.xor(mA);
  }
}
