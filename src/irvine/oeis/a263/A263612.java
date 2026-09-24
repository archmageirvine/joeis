package irvine.oeis.a263;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a118.A118596;

/**
 * A263612 Palindromes in base 5 which are also squares.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A263612 extends FilterSequence {

  /** Construct the sequence. */
  public A263612() {
    super(1, new A118596(), k -> Predicates.SQUARE.is(new Z(k.toString(), 5)));
  }
}
