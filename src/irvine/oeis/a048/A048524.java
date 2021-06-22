package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A048524 Primes for which only two iterations of 'Prime plus its digit sum equals a prime' are possible.
 * @author Sean A. Irvine
 */
public class A048524 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.add(ZUtils.digitSum(p));
      if (q.isProbablePrime()) {
        final Z r = q.add(ZUtils.digitSum(q));
        if (r.isProbablePrime() && !r.add(ZUtils.digitSum(r)).isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
