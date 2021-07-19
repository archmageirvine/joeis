package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020789 Decimal expansion of 1/sqrt(32).
 * @author Sean A. Irvine
 */
public class A020789 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020789() {
    super(CR.valueOf(32).sqrt().inverse());
  }
}
