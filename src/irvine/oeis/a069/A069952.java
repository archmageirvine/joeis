package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069952 Numbers k such that (k+1)*phi(k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069952 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(Functions.PHI.z(++mN).multiply(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
