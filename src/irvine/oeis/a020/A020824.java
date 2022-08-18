package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020824 Decimal expansion of 1/sqrt(67).
 * @author Sean A. Irvine
 */
public class A020824 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020824() {
    super(0, CR.valueOf(67).sqrt().inverse());
  }
}
