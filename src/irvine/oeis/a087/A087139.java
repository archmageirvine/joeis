package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047864 Number of labeled bipartite graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A087139 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    long k = 1;
    while (true) {
      ++k;
      final Z r = q;
      q = q.multiply(p);
      if (q.subtract(r).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
