package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A007770 Happy numbers: numbers whose trajectory under iteration of sum of squares of digits map (see A003132) includes 1.
 * @author Sean A. Irvine
 */
public class A007770 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A007770() {
    super(1, Predicates.HAPPY::is);
  }
}
