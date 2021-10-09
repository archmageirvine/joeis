package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020831 Decimal expansion of 1/sqrt(74).
 * @author Sean A. Irvine
 */
public class A020831 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020831() {
    super(CR.valueOf(74).sqrt().inverse());
  }
}
