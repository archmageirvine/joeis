package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A030476.
 * @author Sean A. Irvine
 */
public class A030476 extends A000290 {

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (!A030475.isMixed(square)) {
        return square;
      }
    }
  }
}
