package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028839;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070713 extends FilterSequence {

  /** Construct the sequence. */
  public A070713() {
    super(1, new A028839(), k -> {
      final Z dp = Functions.DIGIT_PRODUCT.z(k);
      return !dp.isZero() && Predicates.SQUARE.is(dp);
    });
  }
}
