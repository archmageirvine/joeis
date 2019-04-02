package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014450 Even numbers in the triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014450 extends A008292 {

  @Override
  public Z next() {
    while (true) {
      final Z res = super.next();
      if (res.isEven()) {
        return res;
      }
    }
  }
}

