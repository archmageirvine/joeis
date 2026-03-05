package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A393611 a(n) = least positive integer k such that A002476(n) + 3^k + 1 is prime, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A393611 extends A002476 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply(3);
      if (p.add(t).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
