package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020850 Decimal expansion of 1/sqrt(93).
 * @author Sean A. Irvine
 */
public class A020850 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020850() {
    super(0, CR.valueOf(93).sqrt().inverse());
  }
}
