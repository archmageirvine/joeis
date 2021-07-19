package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020778 Decimal expansion of 1/sqrt(21).
 * @author Sean A. Irvine
 */
public class A020778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020778() {
    super(CR.valueOf(21).sqrt().inverse());
  }
}
