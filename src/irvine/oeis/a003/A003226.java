package irvine.oeis.a003;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A003226 Automorphic numbers: m^2 ends with m.
 * @author Sean A. Irvine
 */
public class A003226 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A003226() {
    super(1, 0, Predicates.AUTOMORPHIC::is);
  }
}
