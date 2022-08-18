package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020844 Decimal expansion of 1/sqrt(87).
 * @author Sean A. Irvine
 */
public class A020844 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020844() {
    super(0, CR.valueOf(87).sqrt().inverse());
  }
}
