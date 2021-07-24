package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068432 Expansion of golden ratio (1 + sqrt(5))/2 in base 2.
 * @author Sean A. Irvine
 */
public class A068432 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068432() {
    super(1, CR.PHI, 2);
  }
}
