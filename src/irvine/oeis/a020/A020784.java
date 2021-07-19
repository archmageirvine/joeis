package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020784 Decimal expansion of 1/sqrt(27).
 * @author Sean A. Irvine
 */
public class A020784 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020784() {
    super(CR.valueOf(27).sqrt().inverse());
  }
}
