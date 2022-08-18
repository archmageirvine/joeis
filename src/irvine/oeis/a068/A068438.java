package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068438 Expansion of Pi in base 13.
 * @author Sean A. Irvine
 */
public class A068438 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068438() {
    super(1, CR.PI, 13);
  }
}
