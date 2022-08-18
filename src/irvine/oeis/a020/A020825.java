package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020825 Decimal expansion of 1/sqrt(68).
 * @author Sean A. Irvine
 */
public class A020825 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020825() {
    super(0, CR.valueOf(68).sqrt().inverse());
  }
}
