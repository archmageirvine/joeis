package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020765 Decimal expansion of 1/sqrt(8).
 * @author Sean A. Irvine
 */
public class A020765 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020765() {
    super(0, CR.EIGHT.sqrt().inverse());
  }
}
