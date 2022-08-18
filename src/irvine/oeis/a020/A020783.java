package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020783 Decimal expansion of 1/sqrt(26).
 * @author Sean A. Irvine
 */
public class A020783 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020783() {
    super(0, CR.valueOf(26).sqrt().inverse());
  }
}
