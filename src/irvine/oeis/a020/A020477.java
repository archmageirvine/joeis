package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020477 Numbers whose sum of divisors is a cube.
 * @author Sean A. Irvine
 */
public class A020477 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Functions.SIGMA.z(++mN);
      if (Predicates.CUBE.is(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
