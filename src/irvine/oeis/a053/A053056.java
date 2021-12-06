package irvine.oeis.a053;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A053056 Fibonacci numbers whose digit sum is also a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A053056 extends A000045 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (Z.ONE.equals(f)) {
        super.next(); // skip second 1
      }
      final long d = ZUtils.digitSum(f);
      if (Fibonacci.inverseFibonacci(Z.valueOf(d)) >= 0) {
        return f;
      }
    }
  }
}
