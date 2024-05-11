package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A030690 Smallest nontrivial extension of n-th square which is a cube.
 * @author Sean A. Irvine
 */
public class A030690 extends A000290 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
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

