package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020808 Decimal expansion of 1/sqrt(51).
 * @author Sean A. Irvine
 */
public class A020808 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020808() {
    super(0, CR.valueOf(51).sqrt().inverse());
  }
}
