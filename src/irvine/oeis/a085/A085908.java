package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085908 Smallest 7-smooth number beginning with n.
 * @author Sean A. Irvine
 */
public class A085908 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.SMOOTH.is(7, ++mN)) {
      return Z.valueOf(mN);
    }
    Z k = Z.valueOf(mN);
    long lim = 1;
    long j = 0;
    while (true) {
      if (++j >= lim) {
        k = k.multiply(10);
        lim *= 10;
        j = 0;
      }
      final Z t = k.add(j);
      if (Predicates.SMOOTH.is(7, t)) {
        return t;
      }
    }
  }
}
