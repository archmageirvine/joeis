package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079465 Numbers k such that the "inventory" A063850 of k is a perfect square.
 * @author Sean A. Irvine
 */
public class A079465 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(Functions.INVENTORY.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
