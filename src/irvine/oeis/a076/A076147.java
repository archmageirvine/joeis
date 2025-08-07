package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076147 Numbers k such that the k-th prime + k is a cube.
 * @author Sean A. Irvine
 */
public class A076147 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.CUBE.is(super.next().add(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
