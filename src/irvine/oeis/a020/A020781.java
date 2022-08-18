package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020781 Decimal expansion of 1/sqrt(24).
 * @author Sean A. Irvine
 */
public class A020781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020781() {
    super(0, CR.valueOf(24).sqrt().inverse());
  }
}
