package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A001599.
 * @author Sean A. Irvine
 */
public class A074268 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      final Z p = q.square().subtract(q).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
