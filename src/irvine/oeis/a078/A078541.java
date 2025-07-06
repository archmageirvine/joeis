package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A078541 Refactorable numbers x, such that quotient x/A000005(x) equals a power of 2.
 * @author Sean A. Irvine
 */
public class A078541 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (Predicates.POWER_OF_TWO.is(k.divide(Functions.SIGMA0.z(k)))) {
        return k;
      }
    }
  }
}

