package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A067070 Cubes for which the product of the digits is a cube &gt; 0.
 * @author Sean A. Irvine
 */
public class A067070 extends Sequence1 {

  private final Sequence mCubes = new A000578();

  @Override
  public Z next() {
    while (true) {
      final Z c = mCubes.next();
      final Z p = Functions.DIGIT_PRODUCT.z(c);
      if (p.signum() > 0 && Predicates.CUBE.is(p)) {
        return c;
      }
    }
  }
}
