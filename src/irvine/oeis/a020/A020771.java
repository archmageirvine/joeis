package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020771 Decimal expansion of 1/sqrt(14).
 * @author Sean A. Irvine
 */
public class A020771 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020771() {
    super(0, CR.valueOf(14).sqrt().inverse());
  }
}
