package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020792 Decimal expansion of 1/sqrt(35).
 * @author Sean A. Irvine
 */
public class A020792 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020792() {
    super(CR.valueOf(35).sqrt().inverse());
  }
}
