package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020804 Decimal expansion of 1/sqrt(47).
 * @author Sean A. Irvine
 */
public class A020804 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020804() {
    super(CR.valueOf(47).sqrt().inverse());
  }
}
