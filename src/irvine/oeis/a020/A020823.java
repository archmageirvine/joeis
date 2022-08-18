package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020823 Decimal expansion of 1/sqrt(66).
 * @author Sean A. Irvine
 */
public class A020823 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020823() {
    super(0, CR.valueOf(66).sqrt().inverse());
  }
}
