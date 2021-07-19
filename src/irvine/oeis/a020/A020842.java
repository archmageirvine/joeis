package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020842 Decimal expansion of 1/sqrt(85).
 * @author Sean A. Irvine
 */
public class A020842 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020842() {
    super(CR.valueOf(85).sqrt().inverse());
  }
}
