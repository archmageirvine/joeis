package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A035127 Squares which when digits are rotated left once remain square.
 * @author Sean A. Irvine
 */
public class A035127 extends A000290 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final String t = s.toString();
      if ((t.length() == 1 || t.charAt(1) != '0') && new Z(t.substring(1) + t.charAt(0)).isSquare()) {
        return s;
      }
    }
  }
}
