package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057328 First member of a prime 5-tuple in a 2p-1 progression.
 * @author Sean A. Irvine
 */
public class A057328 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.multiply2().subtract(1);
      if (q.isProbablePrime()) {
        final Z r = q.multiply2().subtract(1);
        if (r.isProbablePrime()) {
          final Z s = r.multiply2().subtract(1);
          if (s.isProbablePrime() && s.multiply2().subtract(1).isProbablePrime()) {
            return p;
          }
        }
      }
    }
  }
}
