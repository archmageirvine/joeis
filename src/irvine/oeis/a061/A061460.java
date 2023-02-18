package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A061460 Cubes which produce cubes when the leading digit is moved to the end.
 * @author Sean A. Irvine
 */
public class A061460 extends A000578 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final String s = t.toString();
      final Z r = new Z(s.substring(1) + s.charAt(0));
      r.root(3);
      if (r.auxiliary() == 1) {
        return t;
      }
    }
  }
}

