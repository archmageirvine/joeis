package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020852 Decimal expansion of 1/sqrt(95).
 * @author Sean A. Irvine
 */
public class A020852 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020852() {
    super(CR.valueOf(95).sqrt().inverse());
  }
}
