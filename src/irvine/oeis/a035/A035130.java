package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A035130 Cubes when digits rotated right once remain cubic.
 * @author Sean A. Irvine
 */
public class A035130 extends A000578 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final String t = s.toString();
      final Z rot = new Z(t.charAt(t.length() - 1) + t.substring(0, t.length() - 1));
      rot.root(3);
      if (rot.auxiliary() == 1) {
        return s;
      }
    }
  }
}
