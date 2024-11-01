package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A072701.
 * @author Sean A. Irvine
 */
public class A072825 extends A002182 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.add(1).isSquare()) {
        return c.add(1).sqrt();
      }
    }
  }
}
