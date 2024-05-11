package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030668 Smallest nontrivial extension of n which is a cube.
 * @author Sean A. Irvine
 */
public class A030668 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).multiply(10);
    long lim = 10;
    long v = -1;
    while (true) {
      if (++v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
      }
      final Z u = t.add(v);
      if (Predicates.CUBE.is(u)) {
        return u;
      }
    }
  }
}

