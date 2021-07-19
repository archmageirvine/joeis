package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020769 Decimal expansion of 1/sqrt(12) = 1/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A020769 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020769() {
    super(CR.valueOf(12).sqrt().inverse());
  }
}
