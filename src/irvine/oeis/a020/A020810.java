package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020810 Decimal expansion of 1/sqrt(53).
 * @author Sean A. Irvine
 */
public class A020810 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020810() {
    super(0, CR.valueOf(53).sqrt().inverse());
  }
}
