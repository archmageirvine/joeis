package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020834 Decimal expansion of 1/sqrt(77).
 * @author Sean A. Irvine
 */
public class A020834 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020834() {
    super(CR.valueOf(77).sqrt().inverse());
  }
}
