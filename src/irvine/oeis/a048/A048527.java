package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048527 Primes for which only five iterations of 'Prime plus its digit sum equals a prime' are possible.
 * @author Sean A. Irvine
 */
public class A048527 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.add(Functions.DIGIT_SUM.l(p));
      if (q.isProbablePrime()) {
        final Z r = q.add(Functions.DIGIT_SUM.l(q));
        if (r.isProbablePrime()) {
          final Z s = r.add(Functions.DIGIT_SUM.l(r));
          if (s.isProbablePrime()) {
            final Z t = s.add(Functions.DIGIT_SUM.l(s));
            if (t.isProbablePrime()) {
              final Z u = t.add(Functions.DIGIT_SUM.l(t));
              if (u.isProbablePrime() && !u.add(Functions.DIGIT_SUM.l(u)).isProbablePrime()) {
                return p;
              }
            }
          }
        }
      }
    }
  }
}
