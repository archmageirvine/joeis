package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a034.A034961;

/**
 * A076305 Numbers k such that prime(k) + prime(k+1) + prime(k+2) is a square.
 * @author Sean A. Irvine
 */
public class A076305 extends A034961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = super.next();
      if (Predicates.SQUARE.is(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
