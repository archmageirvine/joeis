package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;

/**
 * A035131 Cubes that when digits rotated left once remain cubic.
 * @author Sean A. Irvine
 */
public class A035131 extends A000578 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final String t = s.toString();
      if ((t.length() == 1 || t.charAt(1) != '0') && ZUtils.isCube(new Z(t.substring(1) + t.charAt(0)))) {
        return s;
      }
    }
  }
}
