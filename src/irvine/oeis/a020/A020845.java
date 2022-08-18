package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020845 Decimal expansion of 1/sqrt(88).
 * @author Sean A. Irvine
 */
public class A020845 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020845() {
    super(0, CR.valueOf(88).sqrt().inverse());
  }
}
