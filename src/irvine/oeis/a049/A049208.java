package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A049208 Perfect square associated with A048699.
 * @author Sean A. Irvine
 */
public class A049208 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final Z t = Functions.SIGMA.z(a).subtract(a);
      if (t.isSquare()) {
        return t;
      }
    }
  }
}

