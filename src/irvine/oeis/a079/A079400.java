package irvine.oeis.a079;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A072283.
 * @author Sean A. Irvine
 */
public class A079400 extends A000594 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PRIME.is(++mN)) {
        return t.multiply(Z.valueOf(mN).pow(11));
      }
    }
  }
}
