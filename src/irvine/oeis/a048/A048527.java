package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
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
      final Z q = p.add(ZUtils.digitSum(p));
      if (q.isProbablePrime()) {
        final Z r = q.add(ZUtils.digitSum(q));
        if (r.isProbablePrime()) {
          final Z s = r.add(ZUtils.digitSum(r));
          if (s.isProbablePrime()) {
            final Z t = s.add(ZUtils.digitSum(s));
            if (t.isProbablePrime()) {
              final Z u = t.add(ZUtils.digitSum(t));
              if (u.isProbablePrime() && !u.add(ZUtils.digitSum(u)).isProbablePrime()) {
                return p;
              }
            }
          }
        }
      }
    }
  }
}
