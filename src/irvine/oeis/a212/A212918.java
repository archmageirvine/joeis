package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-03-27/filtpos at 2024-03-27 21:37

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001414;

/**
 * A212918 Numbers whose sum of prime factors (counted with multiplicity) is a pentagonal number (A000326).
 * @author Georg Fischer
 */
public class A212918 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A212918() {
    super(1, 1, new A001414(), v -> Predicates.POLYGONAL.is(5, v));
  }
}
