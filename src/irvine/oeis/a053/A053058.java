package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A053058 Cubes whose digit sum is also a cube.
 * @author Sean A. Irvine
 */
public class A053058 extends A000578 {

  /** Construct the sequence. */
  public A053058() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z cube = super.next();
      final long d = Functions.DIGIT_SUM.l(cube);
      if (Predicates.CUBE.is(d)) {
        return cube;
      }
    }
  }
}
