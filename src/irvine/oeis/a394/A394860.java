package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a332.A332785;

/**
 * A394860 Numbers that are neither squarefree nor squareful, with exponents of prime power factors that are distinct.
 * @author Sean A. Irvine
 */
public class A394860 extends FilterSequence {

  /** Construct the sequence. */
  public A394860() {
    super(1, new A332785(), Predicates.DISTINCT_EXPONENTS::is);
  }
}
