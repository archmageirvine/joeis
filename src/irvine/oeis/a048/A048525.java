package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048525 Primes for which only three iterations of 'Prime plus its digit sum equals a prime' are possible.
 * @author Sean A. Irvine
 */
public class A048525 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.add(Functions.DIGIT_SUM.l(p));
      if (q.isProbablePrime()) {
        final Z r = q.add(Functions.DIGIT_SUM.l(q));
        if (r.isProbablePrime()) {
          final Z s = r.add(Functions.DIGIT_SUM.l(r));
          if (s.isProbablePrime() && !s.add(Functions.DIGIT_SUM.l(s)).isProbablePrime()) {
            return p;
          }
        }
      }
    }
  }
}
