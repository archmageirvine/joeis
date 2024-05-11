package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A069077 Triangular numbers such that the product of digits is also a (positive) triangular number.
 * @author Sean A. Irvine
 */
public class A069077 extends FilterSequence {

  /** Construct the sequence. */
  public A069077() {
    super(1, new A000217().skip(), k -> {
      final Z prod = Functions.DIGIT_PRODUCT.z(k);
      return !prod.isZero() && Predicates.TRIANGULAR.is(prod);
    });
  }
}

