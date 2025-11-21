package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081990 Numbers k that have no zero digits and such that both k+1 and (product of digits of k) + 1 are squares.
 * @author Sean A. Irvine
 */
public class A081990 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square().subtract(1);
      final Z d = Functions.DIGIT_PRODUCT.z(s);
      if (!d.isZero() && Predicates.SQUARE.is(d.add(1))) {
        return s;
      }
    }
  }
}
