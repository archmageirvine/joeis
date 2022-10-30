package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057325 First member of a prime quadruple in a p^2+p-1 progression.
 * @author Sean A. Irvine
 */
public class A057325 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.square().add(p).subtract(1);
      if (q.isProbablePrime()) {
        final Z r = q.square().add(q).subtract(1);
        if (r.isProbablePrime() && r.square().add(r).subtract(1).isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
