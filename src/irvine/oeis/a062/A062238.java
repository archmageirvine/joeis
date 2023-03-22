package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A062238 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z[] d = Jaguar.factor(c).divisorsSorted();
      if (c.toString().contains(d[d.length - 2].toString())) {
        return c;
      }
    }
  }
}

