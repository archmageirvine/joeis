package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057326 First member of a prime triple in a 2p-1 progression.
 * @author Sean A. Irvine
 */
public class A057326 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.multiply2().subtract(1);
      if (q.isProbablePrime() && q.multiply2().subtract(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
