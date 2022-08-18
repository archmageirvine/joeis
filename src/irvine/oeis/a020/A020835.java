package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020835 Decimal expansion of 1/sqrt(78).
 * @author Sean A. Irvine
 */
public class A020835 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020835() {
    super(0, CR.valueOf(78).sqrt().inverse());
  }
}
