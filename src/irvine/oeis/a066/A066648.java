package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A066648 Cubes of the form a^2 + b^3 with a, b &gt; 0.
 * @author Sean A. Irvine
 */
public class A066648 extends Sequence1 {

  private final Sequence mCubes = new A000578();

  private boolean is(final Z cube) {
    long k = 0;
    Z c;
    while ((c = cube.subtract(Z.valueOf(++k).pow(3))).signum() > 0) {
      if (c.isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z cube = mCubes.next();
      if (is(cube)) {
        return cube;
      }
    }
  }
}
