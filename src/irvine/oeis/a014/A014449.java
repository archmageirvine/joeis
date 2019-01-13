package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014449.
 * @author Sean A. Irvine
 */
public class A014449 extends A008292 {

  @Override
  public Z next() {
    while (true) {
      final Z res = super.next();
      if (!res.equals(Z.ONE)) {
        return res;
      }
    }
  }
}

