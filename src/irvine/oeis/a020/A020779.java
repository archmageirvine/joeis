package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020779 Decimal expansion of 1/sqrt(22).
 * @author Sean A. Irvine
 */
public class A020779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020779() {
    super(0, CR.valueOf(22).sqrt().inverse());
  }
}
