package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020786 Decimal expansion of 1/sqrt(29).
 * @author Sean A. Irvine
 */
public class A020786 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020786() {
    super(CR.valueOf(29).sqrt().inverse());
  }
}
