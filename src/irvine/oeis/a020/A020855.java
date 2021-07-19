package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020855 Decimal expansion of 1/sqrt(98).
 * @author Sean A. Irvine
 */
public class A020855 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020855() {
    super(CR.valueOf(98).sqrt().inverse());
  }
}
