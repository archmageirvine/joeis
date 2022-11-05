package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A035126 Squares when digits rotated right once remain square.
 * @author Sean A. Irvine
 */
public class A035126 extends A000290 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final String t = s.toString();
      if (new Z(t.charAt(t.length() - 1) + t.substring(0, t.length() - 1)).isSquare()) {
        return s;
      }
    }
  }
}
