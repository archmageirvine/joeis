package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020814 Decimal expansion of 1/sqrt(57).
 * @author Sean A. Irvine
 */
public class A020814 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020814() {
    super(0, CR.valueOf(57).sqrt().inverse());
  }
}
