package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083500 Smallest k such that n*(n+k) + 1 is a cube.
 * @author Sean A. Irvine
 */
public class A083500 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      if (Predicates.CUBE.is(n.multiply(mN + ++k).add(1))) {
        return Z.valueOf(k);
      }
    }
  }
}
