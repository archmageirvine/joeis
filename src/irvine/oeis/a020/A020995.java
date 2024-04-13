package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020995 Numbers k such that the sum of the digits of Fibonacci(k) is k.
 * @author Sean A. Irvine
 */
public class A020995 extends A000045 {

  {
    setOffset(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(super.next()) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
