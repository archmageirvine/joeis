package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066733 Numbers such that the nonzero product of the digits of its square is also a square.
 * @author Sean A. Irvine
 */
public class A066733 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN * mN;
      final long prod = Functions.DIGIT_PRODUCT.l(v);
      if (prod != 0 && Predicates.SQUARE.is(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
