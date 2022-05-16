package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a078.A078473;

/**
 * A035282 Expansion of zeta function of icosian ring (nonzero terms).
 * @author Sean A. Irvine
 */
public class A035282 extends A078473 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}

