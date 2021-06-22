package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
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
      final Z q = p.add(ZUtils.digitSum(p));
      if (q.isProbablePrime() && !q.add(ZUtils.digitSum(q)).isProbablePrime()) {
        return p;
      }
    }
  }
}
