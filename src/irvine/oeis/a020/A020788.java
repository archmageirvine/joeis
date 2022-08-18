package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020788 Decimal expansion of 1/sqrt(31).
 * @author Sean A. Irvine
 */
public class A020788 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020788() {
    super(0, CR.valueOf(31).sqrt().inverse());
  }
}
