package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052019 Sum of digits of prime p is substring of p.
 * @author Sean A. Irvine
 */
public class A052019 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long sum = Functions.DIGIT_SUM.l(p);
      if (p.toString().contains(String.valueOf(sum))) {
        return p;
      }
    }
  }
}
