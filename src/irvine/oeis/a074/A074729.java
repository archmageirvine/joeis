package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066417;

/**
 * A074729 Numbers whose sum of anti-divisors is a square.
 * @author Sean A. Irvine
 */
public class A074729 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074729() {
    super(1, 1, new A066417(), Predicates.SQUARE::is);
  }
}
