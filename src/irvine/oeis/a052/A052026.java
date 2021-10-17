package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A052026 Composites base 10 that remain composite in all bases b, 2&lt;=b&lt;=10, expansions interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A052026 extends A002808 {

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z c = super.next();
      for (int base = 2; base < 10; ++base) {
        if (new Z(c.toString(base)).isProbablePrime()) {
          continue outer;
        }
      }
      return c;
    }
  }
}
