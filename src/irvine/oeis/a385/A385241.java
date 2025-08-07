package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A385241 a(n) is the least positive integer k such that the digit sum of prime(n) + k divides the concatenation of prime(n) - 1 and prime(n), where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A385241 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z concat = new Z(p.subtract(1).toString() + p);
    long k = 0;
    while (true) {
      if (concat.mod(Functions.DIGIT_SUM.l(p.add(++k))) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
