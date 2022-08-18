package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020856 Decimal expansion of 1/sqrt(99).
 * @author Sean A. Irvine
 */
public class A020856 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020856() {
    super(0, CR.valueOf(99).sqrt().inverse());
  }
}
