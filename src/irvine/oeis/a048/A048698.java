package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A048698 Nonprime numbers k such that sum of aliquot divisors of k is a cube.
 * @author Sean A. Irvine
 */
public class A048698 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Predicates.CUBE.is(Functions.SIGMA1.z(a).subtract(a))) {
        return a;
      }
    }
  }
}

