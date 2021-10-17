package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052027 Primes in base 10 that remain primes in seven bases b, 2&lt;=b&lt;=10, expansions interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A052027 extends A000040 {

  protected int target() {
    return 7;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      int cnt = 1;
      for (int base = 2; base < 10; ++base) {
        if (new Z(p.toString(base)).isProbablePrime()) {
          ++cnt;
        }
      }
      if (cnt == target()) {
        return p;
      }
    }
  }
}
