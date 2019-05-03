package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;
import irvine.oeis.a000.A000787;

/**
 * A018848 Strobogrammatic squares: the same upside down <code>(probably finite)</code>.
 * @author Sean A. Irvine
 */
public class A018848 extends A000290 {

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (A000787.isStrobogrammatic(square)) {
        return square;
      }
    }
  }
}

