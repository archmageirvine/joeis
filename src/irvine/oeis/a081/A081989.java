package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081989 Product of digits + 1 is a square greater than 1.
 * @author Sean A. Irvine
 */
public class A081989 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z d = Functions.DIGIT_PRODUCT.z(++mN);
      if (!d.isZero() && Predicates.SQUARE.is(d.add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
