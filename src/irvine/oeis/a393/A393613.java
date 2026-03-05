package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393613 a(n) = least positive integer k such that prime(n) + 2^k + 4 is prime, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A393613 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.NEG_ONE;
    }
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply2();
      if (p.add(t).add(4).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
