package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020794 Decimal expansion of 1/sqrt(37).
 * @author Sean A. Irvine
 */
public class A020794 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020794() {
    super(CR.valueOf(37).sqrt().inverse());
  }
}
