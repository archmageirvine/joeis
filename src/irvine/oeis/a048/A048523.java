package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048523 Primes for which only one iteration of 'Prime plus its digit sum equals a prime' is possible.
 * @author Sean A. Irvine
 */
public class A048523 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.add(Functions.DIGIT_SUM.l(p));
      if (q.isProbablePrime() && !q.add(Functions.DIGIT_SUM.l(q)).isProbablePrime()) {
        return p;
      }
    }
  }
}
