package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020763 Decimal expansion of 1/sqrt(6).
 * @author Sean A. Irvine
 */
public class A020763 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020763() {
    super(CR.SIX.sqrt().inverse());
  }
}
