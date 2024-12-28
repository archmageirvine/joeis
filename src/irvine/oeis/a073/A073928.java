package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073928 Smallest prime q of form q=-1+(c+1)*10^w, where c runs through composites not divisible by 3.
 * @author Sean A. Irvine
 */
public class A073928 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.mod(3) != 0) {
        Z c1 = c.add(1);
        while (true) {
          c1 = c1.multiply(10);
          final Z q = c1.subtract(1);
          if (q.isProbablePrime()) {
            return q;
          }
        }
      }
    }
  }
}
