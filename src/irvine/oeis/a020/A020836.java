package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020836 Decimal expansion of 1/sqrt(79).
 * @author Sean A. Irvine
 */
public class A020836 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020836() {
    super(CR.valueOf(79).sqrt().inverse());
  }
}
