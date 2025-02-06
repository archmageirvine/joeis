package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075026 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z s = Functions.SIGMA0.z(c);
      if (s.compareTo(Functions.SIGMA0.z(c.subtract(1))) < 0 && s.compareTo(Functions.SIGMA0.z(c.add(1))) < 0) {
        return c;
      }
    }
  }
}

