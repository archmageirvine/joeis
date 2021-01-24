package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A038596 Squares that are a difference between 2 positive cubes.
 * @author Sean A. Irvine
 */
public class A038596 extends A000290 {

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final Z lim = square.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        final Z s = square.add(x.pow(3));
        s.root(3);
        if (s.auxiliary() == 1) {
          return square;
        }
      }
    }
  }
}
