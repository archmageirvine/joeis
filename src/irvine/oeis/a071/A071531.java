package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071531 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    Z t = Z.ONE;
    while (true) {
      ++r;
      t = t.multiply(mN);
      if (Predicates.DIGIT_CONTAINS_ZERO.is(t)) {
        return Z.valueOf(r);
      }
    }
  }
}
