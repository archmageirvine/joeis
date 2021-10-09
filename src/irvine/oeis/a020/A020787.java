package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020787 Decimal expansion of 1/sqrt(30).
 * @author Sean A. Irvine
 */
public class A020787 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020787() {
    super(CR.valueOf(30).sqrt().inverse());
  }
}
