package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000326;

/**
 * A117710 Pentagonal numbers for which the product of the digits is also a pentagonal number.
 * @author Georg Fischer
 */
public class A117710 extends FilterSequence {

  /** Construct the sequence. */
  public A117710() {
    super(0, new A000326(), v -> Predicates.POLYGONAL.is(5, Functions.DIGIT_PRODUCT.z(v)));
  }
}
