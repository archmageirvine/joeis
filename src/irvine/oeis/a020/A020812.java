package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020812 Decimal expansion of 1/sqrt(55).
 * @author Sean A. Irvine
 */
public class A020812 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020812() {
    super(0, CR.valueOf(55).sqrt().inverse());
  }
}
