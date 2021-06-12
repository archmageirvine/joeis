package irvine.oeis.a344;

import irvine.math.z.Z;
import irvine.oeis.a097.A097621;

/**
 * A344826.
 * @author Sean A. Irvine
 */
public class A344826 extends A097621 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z n = Z.valueOf(mN);
      if (n.mod(t).isZero()) {
        return n;
      }
    }
  }
}

