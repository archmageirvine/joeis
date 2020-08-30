package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034470 Prime numbers using only the curved digits 0, 2, 3, 5, 6, 8 and 9.
 * @author Sean A. Irvine
 */
public class A034470 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      if (!s.contains("1") && !s.contains("4") && !s.contains("7")) {
        return p;
      }
    }
  }
}
