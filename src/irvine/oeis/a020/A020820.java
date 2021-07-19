package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020820 Decimal expansion of 1/sqrt(63).
 * @author Sean A. Irvine
 */
public class A020820 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020820() {
    super(CR.valueOf(63).sqrt().inverse());
  }
}
